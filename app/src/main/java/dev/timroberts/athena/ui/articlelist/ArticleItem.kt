package dev.timroberts.athena.ui.articlelist

import com.xwray.groupie.GroupieViewHolder
import com.xwray.groupie.Item
import dev.timroberts.athena.R
import kotlinx.android.synthetic.main.article_item.view.*

class ArticleItem(val id: Int) : Item<GroupieViewHolder>() {

    override fun getLayout() = R.layout.article_item

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        viewHolder.itemView.testTV.text = id.toString()
    }
}