package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        menToggleButton.setOnClickListener {
            womenToggleButton.isChecked = false
            coedToggleButton.isChecked = false
            selectedLeague = "Men"
        }

        womenToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            coedToggleButton.isChecked = false
            selectedLeague = "Women"
        }

        coedToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            womenToggleButton.isChecked = false
            selectedLeague = "Co-ed"
        }
        nextButton.setOnClickListener {
            if(selectedLeague != ""){
                val skillIntent = Intent(this,SkillSelectionScreen::class.java)
                skillIntent.putExtra(EXTRA_LEAGUE,skillIntent)
                startActivity(skillIntent)
            }
        }
    }
}