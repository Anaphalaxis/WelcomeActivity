package com.anaphalaxis.welcomeactivity.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anaphalaxis.welcomeactivity.R
import com.anaphalaxis.welcomeactivity.Utilities.EXTRA_LEAGUE
import com.anaphalaxis.welcomeactivity.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_finish.*

class FInishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searchLeaguesText.text = "Looking for $league $skill league near you"
    }
}
