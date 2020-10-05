package dev.timroberts.athena.ui.articlelist

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import dev.timroberts.athena.data.remote.RedditService

class ArticleListViewModel @ViewModelInject constructor(
    val redditService: RedditService
) : ViewModel() {
    // TODO: Implement the ViewModel
}