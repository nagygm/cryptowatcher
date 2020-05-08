package com.nagygm.cryptowatcher.model

import com.google.gson.annotations.SerializedName

class DeveloperData {
   @SerializedName("forks")
    private val forks: Long = 0

   @SerializedName("stars")
    private val stars: Long = 0

   @SerializedName("subscribers")
    private val subscribers: Long = 0

   @SerializedName("total_issues")
    private val totalIssues: Long = 0

   @SerializedName("closed_issues")
    private val closedIssues: Long = 0

   @SerializedName("pull_requests_merged")
    private val pullRequestsMerged: Long = 0

   @SerializedName("pull_request_contributors")
    private val pullRequestContributors: Long = 0

   @SerializedName("code_additions_deletions_4_weeks")
    private val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks? = null

   @SerializedName("commit_count_4_weeks")
    private val commitCount4Weeks: Long = 0

   @SerializedName("last_4_weeks_commit_activity_series")
    private val last4WeeksCommitActivitySeries: List<Long>? = null
}