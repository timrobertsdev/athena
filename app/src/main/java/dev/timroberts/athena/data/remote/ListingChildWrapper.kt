package dev.timroberts.athena.data.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ListingChildWrapper(
    val kind: String,
    val data: ListingChild
)