package com.anaphalaxis.welcomeactivity.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anaphalaxis.welcomeactivity.Model.Player
import com.anaphalaxis.welcomeactivity.R
import com.anaphalaxis.welcomeactivity.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FInishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you"
    }
}
