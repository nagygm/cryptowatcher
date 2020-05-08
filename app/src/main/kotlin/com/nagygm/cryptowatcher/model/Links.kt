package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class Links {
   @SerializedName("homepage")
    private val homepage: List<String>? = null

   @SerializedName("blockchain_site")
    private val blockchainSite: List<String>? = null

   @SerializedName("official_forum_url")
    private val officialForumUrl: List<String>? = null

   @SerializedName("chat_url")
    private val chatUrl: List<String>? = null

   @SerializedName("announcement_url")
    private val announcementUrl: List<String>? = null

   @SerializedName("twitter_screen_name")
    private val twitterScreenName: String? = null

   @SerializedName("facebook_username")
    private val facebookUsername: String? = null

   @SerializedName("bitcointalk_thread_identifier")
    private val bitcointalkThreadIdentifier: Any? = null

   @SerializedName("telegram_channel_identifier")
    private val telegramChannelIdentifier: String? = null

   @SerializedName("subreddit_url")
    private val subredditUrl: String? = null

   @SerializedName("repos_url")
    private val reposUrl: ReposUrl? = null
}