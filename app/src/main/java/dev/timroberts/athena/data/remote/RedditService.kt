package dev.timroberts.athena.data.remote

import retrofit2.http.GET

interface RedditService {
    @GET("hot.json")
    suspend fun getHot(): RedditResponse
}