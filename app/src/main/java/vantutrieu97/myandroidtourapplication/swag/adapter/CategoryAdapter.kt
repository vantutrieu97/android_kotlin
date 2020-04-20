package vantutrieu97.myandroidtourapplication.swag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.swag.model.Category

class CategoryAdapter(context: Context, categories: List<Category>) : BaseAdapter() {
    val context = context
    val categories = categories


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val category = categories[position]
        var holder: ViewHolder

        if (convertView == null) {
            view = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage = view.findViewById(R.id.backgroundImg)
            holder.categoryTitle = view.findViewById(R.id.titleTxt)
            view.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            view = convertView
        }
        val resourceId =
            context.resources.getIdentifier(category.image, "mipmap", context.packageName)
        holder.categoryImage?.setImageResource(resourceId)
        holder.categoryTitle?.text = category.title
        return view
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryTitle: TextView? = null
    }
}