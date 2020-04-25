package vantutrieu97.myandroidtourapplication.swag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.swag.model.Product

class ProductRecycleAdapter(val context: Context, val products: List<Product>) :
    RecyclerView.Adapter<ProductRecycleAdapter.ProductHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.product_list_item, parent, false)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        return holder.bindProductData(context, products[position])
    }

    inner class ProductHolder(itemView: View) : ViewHolder(itemView) {
        val productImg = itemView.findViewById<ImageView>(R.id.productImg)
        val productName = itemView.findViewById<TextView>(R.id.productNameTxt)
        val productPrice = itemView.findViewById<TextView>(R.id.productPriceTxt)

        fun bindProductData(context: Context, product: Product) {
            val resourceID =
                context.resources.getIdentifier(product.image, "mipmap", context.packageName)
            productImg.setImageResource(resourceID)
            productName.text = product.title
            productPrice.text = product.price
        }
    }
}