package vantutrieu97.myandroidtourapplication.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import vantutrieu97.myandroidtourapplication.R
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    val foodList = arrayListOf<String>("Chinese", "Hamburger", "McDonald", "KFC chicken")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        seletedFoodTxt.text = "Burger King!"


        decideBtn.setOnClickListener {
            val random = Random
            val randomFoodIndex = random.nextInt(foodList.count())
            seletedFoodTxt.text = foodList[randomFoodIndex].toString()
        }
        addFoodBtn.setOnClickListener {
            val newFood = addFoodEdt.text.toString()
            foodList.add(newFood)
            addFoodEdt.text.clear()
            println(foodList)
        }

    }
}