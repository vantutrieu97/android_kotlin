package vantutrieu97.myandroidtourapplication.controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import vantutrieu97.myandroidtourapplication.R
import vantutrieu97.myandroidtourapplication.Utilities.EXTRA_PLAYER
import vantutrieu97.myandroidtourapplication.model.Player

class LeagueActivity : BaseActivity() {
    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMenBtnClicked(view: View) {
        womanLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "men"

    }

    fun onWomanBtnClicked(view: View) {
        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        player.league = "women"
    }

    fun onCoedClicked(view: View) {
        menLeagueBtn.isChecked = false
        womanLeagueBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }
    }
}
