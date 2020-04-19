package vantutrieu97.myandroidtourapplication.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_finish.*
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.Utilities.EXTRA_PLAYER
import vantutrieu97.myandroidtourapplication.model.Player

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchingTxt.text = "Looking for a ${player.league} ${player.skill} neary you..."
    }
}
