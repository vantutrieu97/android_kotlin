package vantutrieu97.myandroidtourapplication

import EXTRA_LEAGUE
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMenBtnClicked(view: View) {
        womanLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "men"
    }

    fun onWomanBtnClicked(view: View) {
        menLeagueBtn.isChecked = false
        coedLeagueBtn.isChecked = false

        selectedLeague = "women"
    }

    fun onCoedClicked(view: View) {
        menLeagueBtn.isChecked = false
        womanLeagueBtn.isChecked = false

        selectedLeague = "co-ed"
    }

    fun leagueNextClicked(view: View) {
        if (selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT)
        }
    }
}
