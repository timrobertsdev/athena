package dev.timroberts.athena.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dev.timroberts.athena.data.remote.RedditService
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

@Module
@InstallIn(ApplicationComponent::class)
object NetModule {

    @Provides
    fun providesRedditService(): RedditService {
        return Retrofit.Builder()
            .baseUrl("https://reddit.com")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(RedditService::class.java)
    }
}