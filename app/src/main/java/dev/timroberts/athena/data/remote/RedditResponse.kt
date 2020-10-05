package dev.timroberts.athena.data.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RedditResponse(
    val kind: String,
    val data: RedditListing
)