package com.anaphalaxis.welcomeactivity.Controller

import android.content.Intent
import android.os.Bundle
import com.anaphalaxis.welcomeactivity.R
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        GetStarted.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }


}
