package vantutrieu97.myandroidtourapplication.controller

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.Utilities.EXTRA_PLAYER
import vantutrieu97.myandroidtourapplication.model.Player

class SkillActivity : BaseActivity() {
    lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
        Log.i("EXTRA_LEAGUE", "$player")
    }


    fun onBeginnerClicked(view: View) {
        ballerSkillBtn.isChecked = false
        player.skill = "Beginner"
    }

    fun onBallerClicked(view: View) {
        beginnerSkillBtn.isChecked = false
        player.skill = "Baller"
    }

    fun onFinishClicked(view: View) {
        if (player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select a skill", Toast.LENGTH_SHORT).show()
        }
    }
}
