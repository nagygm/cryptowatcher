package com.nagygm.cryptowatcher.ui.main

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nagygm.cryptowatcher.R
import com.nagygm.cryptowatcher.model.CoinWithAllAlerts
import kotlinx.android.synthetic.main.content_pinned_crypto_currencies.view.*


class MainAdapter constructor(
    private val context: Context,
    private var coins: MutableList<CoinWithAllAlerts>) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {


    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.content_pinned_crypto_currencies, viewGroup, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val coin = coins[position]

        coin.coin.image?.let {
            val image = coin.coin.image!!
            if(image.isNotEmpty()) {
                Glide.with(context).load(image).into(holder.coinImage)
            }
        }

        val currentPrice = coin.coin.lastValue

        holder.name.text = coin.coin.name.plus('/').plus(coin.coin.vsCurrency)

        holder.currentPrice.text = currentPrice.toBigDecimal().toPlainString()

        if(coin.alerts.isNotEmpty()) {
            holder.alertTop.text =
                coin.alerts.first { it.isUpperBound }.boundValue.toBigDecimal().toPlainString()

            holder.alertBottom.text =
                coin.alerts.first { !it.isUpperBound }.boundValue.toBigDecimal().toPlainString()
        }
    }

    override fun getItemCount(): Int {
        return coins.size
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var coinImage: ImageView = view.coinImage
        var name: TextView = view.pcName
        var currentPrice: TextView = view.pcCurrentPrice
        var alertTop: TextView = view.pcAlertTop
        var alertBottom: TextView = view.pcAlertBottom
    }

    fun updateData(coins: MutableList<CoinWithAllAlerts>) {
        notifyDataSetChanged()
    }

    fun addItem(position: Int, coin: CoinWithAllAlerts) {
        this.coins.add(position, coin)
        notifyItemInserted(position)
    }

    fun removeItem(position: Int) {
        coins.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, coins.size);
    }
}