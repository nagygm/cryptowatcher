package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class CommunityData {
   @SerializedName("facebook_likes")
    private val facebookLikes = 0.0

   @SerializedName("twitter_followers")
    private val twitterFollowers = 0.0

   @SerializedName("reddit_average_posts_48h")
    private val redditAveragePosts48h = 0.0

   @SerializedName("reddit_average_comments_48h")
    private val redditAverageComments48h = 0.0

   @SerializedName("reddit_subscribers")
    private val redditSubscribers = 0.0

   @SerializedName("reddit_accounts_active_48h")
    private val redditAccountsActive48h = 0.0

   @SerializedName("telegram_channel_user_count")
    private val telegramChannelUserCount = 0.0
}