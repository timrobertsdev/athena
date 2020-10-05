package dev.timroberts.athena.data.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RedditListing(
    val modhash: String,
    val dist: Int,
    val children: List<ListingChildWrapper>,
    val after: String,
    val before: String
)