package dev.timroberts.athena.ui.articlelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.groupiex.plusAssign
import dagger.hilt.android.AndroidEntryPoint
import dev.timroberts.athena.R
import dev.timroberts.athena.data.remote.RedditResponse
import dev.timroberts.athena.domain.Article
import kotlinx.android.synthetic.main.main_fragment.*

@AndroidEntryPoint
class ArticleListFragment : Fragment() {

    private val viewModel: ArticleListViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val adapter = GroupAdapter<GroupieViewHolder>()
        articleListRV.adapter = adapter

        val articleListObserver = Observer<RedditResponse> { articles ->
            for (article in articles.data.children) {
                adapter += ArticleItem(Article(article.data.title, article.data.subreddit))
            }
        }

        viewModel.articles.observe(viewLifecycleOwner, articleListObserver)
    }
}