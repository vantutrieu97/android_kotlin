package vantutrieu97.myandroidtourapplication.swag.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main_swag.*
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.swag.adapter.CategoryRecycleAdapter
import vantutrieu97.myandroidtourapplication.swag.sevices.DataService

class MainSwagActivity : AppCompatActivity() {
    lateinit var adapter: CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_swag)
        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
//        categoryListView.setOnItemClickListener { parent, view, position, id ->
//            run {
//                Toast.makeText(
//                    this,
//                    "You was clicked $position",
//                    Toast.LENGTH_LONG
//                ).show()
//            }
//        }

        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        categoryListView.setHasFixedSize(true)
    }
}
