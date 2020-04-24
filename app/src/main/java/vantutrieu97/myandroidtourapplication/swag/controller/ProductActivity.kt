package vantutrieu97.myandroidtourapplication.swag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.swag.Utilities.EXTRA_CATEGORY

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        val category=intent.getStringExtra(EXTRA_CATEGORY)
       Log.i("aaaa","\"intent.getStringExtra(EXTRA_CATEGORY) : $category\"")
    }
}
