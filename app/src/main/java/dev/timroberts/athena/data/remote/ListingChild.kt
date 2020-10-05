package dev.timroberts.athena.data.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListingChild(
    val subreddit: String,
    val title: String
)