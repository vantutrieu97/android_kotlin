package vantutrieu97.myandroidtourapplication.swag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_swag.*
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.swag.adapter.CategoryAdapter
import vantutrieu97.myandroidtourapplication.swag.sevices.DataService

class MainSwagActivity : AppCompatActivity() {
    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_swag)
        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
    }
}
