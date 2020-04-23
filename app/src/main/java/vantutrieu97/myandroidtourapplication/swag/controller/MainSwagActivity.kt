package vantutrieu97.myandroidtourapplication.swag.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
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
        categoryListView.setOnItemClickListener { parent, view, position, id ->
            run {
                Toast.makeText(
                    this,
                    "You was clicked $position",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}
