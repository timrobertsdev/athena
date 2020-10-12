package dev.timroberts.athena.ui.articlelist

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import dev.timroberts.athena.data.remote.RedditResponse
import dev.timroberts.athena.data.remote.RedditService

class ArticleListViewModel @ViewModelInject constructor(
    private val redditService: RedditService
) : ViewModel() {
    val articles: LiveData<RedditResponse> = liveData {
        val data = redditService.getHot()
        emit(data)
    }
}