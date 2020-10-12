package dev.timroberts.athena.ui.articlelist

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import dev.timroberts.athena.R
import dev.timroberts.athena.domain.Article
import kotlinx.android.synthetic.main.article_item.view.*

class ArticleItem(val data: Article) : Item<GroupieViewHolder>() {

    override fun getLayout() = R.layout.article_item

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.titleTV.text = data.title
        viewHolder.itemView.subredditTV.text = data.subreddit
    }
}