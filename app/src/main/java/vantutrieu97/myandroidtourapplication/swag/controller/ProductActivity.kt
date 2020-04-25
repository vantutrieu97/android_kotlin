package vantutrieu97.myandroidtourapplication.swag.controller

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_product.*
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.swag.Utilities.EXTRA_CATEGORY
import vantutrieu97.myandroidtourapplication.swag.adapter.ProductRecycleAdapter
import vantutrieu97.myandroidtourapplication.swag.sevices.DataService

class ProductActivity : AppCompatActivity() {
    lateinit var adapter: ProductRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val category = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductRecycleAdapter(this, DataService.getProducts(category))
        var spanCount = 2
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 4
        }
        val layoutManager = GridLayoutManager(this, spanCount)
        productsListview.layoutManager = layoutManager
        productsListview.adapter = adapter
    }
}
