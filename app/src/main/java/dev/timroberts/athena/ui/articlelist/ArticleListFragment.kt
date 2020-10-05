package dev.timroberts.athena.ui.articlelist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.groupiex.plusAssign
import dagger.hilt.android.AndroidEntryPoint
import dev.timroberts.athena.R
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

        adapter += ArticleItem(1)
        adapter += ArticleItem(2)
        adapter += ArticleItem(3)

        articleListRV.adapter = adapter
    }

}