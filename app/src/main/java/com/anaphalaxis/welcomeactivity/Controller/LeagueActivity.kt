package com.anaphalaxis.welcomeactivity.Controller

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.anaphalaxis.welcomeactivity.Model.Player
import com.anaphalaxis.welcomeactivity.R
import com.anaphalaxis.welcomeactivity.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onMensClicked(view: View){
        womensBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "mens"
    }

    fun onWomensClicked(view: View){
        mensBtn.isChecked = false
        coedBtn.isChecked = false
        player.league = "womens"

    }

    fun onCoedClicked(view: View) {
        womensBtn.isChecked = false
        mensBtn.isChecked = false
        player.league = "coed"
    }

    fun leagueNextClicked(view: View) {
        if (player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }
        else {
            Toast.makeText(this, "Select a league", Toast.LENGTH_SHORT).show()

        }

    }



}
