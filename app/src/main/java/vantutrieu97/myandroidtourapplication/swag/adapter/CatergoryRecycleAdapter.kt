package vantutrieu97.myandroidtourapplication.swag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.swag.model.Category

class CategoryRecycleAdapter(
    val context: Context,
    val categories: List<Category>,
    val itemClick: (Category) -> Unit
) :
    RecyclerView.Adapter<CategoryRecycleAdapter.Holder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindCategory(categories[position], context)

    }

    inner class Holder(itemView: View, val itemClick: (Category) -> Unit) :
        RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView.findViewById<ImageView>(R.id.backgroundImg)
        val categoryTitle = itemView.findViewById<TextView>(R.id.titleTxt)
        fun bindCategory(category: Category, context: Context) {
            val resourceId =
                context.resources.getIdentifier(category.image, "mipmap", context.packageName)
            categoryImage.setImageResource(resourceId)
            categoryTitle.text = category.title
            itemView.setOnClickListener { itemClick(category) }
        }
    }
}