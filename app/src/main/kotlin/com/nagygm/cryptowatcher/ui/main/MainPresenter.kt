package com.nagygm.cryptowatcher.ui.main

import com.nagygm.cryptowatcher.interactor.main.MainInteractor
import com.nagygm.cryptowatcher.interactor.main.event.GetPinnedCryptoCurrencies
import com.nagygm.cryptowatcher.model.CoinWithAllAlerts
import com.nagygm.cryptowatcher.persistence.CoinDao
import com.nagygm.cryptowatcher.ui.Presenter
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.concurrent.Executor
import javax.inject.Inject


class MainPresenter @Inject constructor(
    private val executor: Executor,
    private val mainInteractor: MainInteractor
) : Presenter<MainScreen>() {

    override fun attachScreen(screen: MainScreen) {
        super.attachScreen(screen)
        EventBus.getDefault().register(this)
    }

    override fun detachScreen() {
        EventBus.getDefault().unregister(this)
        super.detachScreen()
    }

    fun showPinnedCryptoCurrencies() {
        executor.execute {
            mainInteractor.getPinnedCryptoCurrencies()
        }
    }

    fun pinCoin() {
        executor.execute {
            mainInteractor.pinCoin()
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onEventMainThread(event: GetPinnedCryptoCurrencies) {
        if (event.throwable != null) {
            event.throwable?.printStackTrace()
            if (screen != null) {
                screen?.showError(event.throwable?.message.orEmpty())
            }
        } else {
            if (screen != null && event.coins.isNotEmpty()) {
                screen?.showPinnedCryptoCurrencies(event.coins as MutableList<CoinWithAllAlerts>)
            }
        }
    }
}
