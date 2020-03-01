package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.swoosh.models.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

   lateinit var player: Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
        player = Player("","")
        menToggleButton.setOnClickListener {
            womenToggleButton.isChecked = false
            coedToggleButton.isChecked = false
            player.league = "Men"
        }

        womenToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            coedToggleButton.isChecked = false
            player.league = "Women"
        }

        coedToggleButton.setOnClickListener {
            menToggleButton.isChecked = false
            womenToggleButton.isChecked = false
            player.league = "Co-ed"
        }
        nextButton.setOnClickListener {
            if(player.league != ""){
                val skillIntent = Intent(this,SkillSelectionScreen::class.java)
                skillIntent.putExtra(EXTRA_PLAYER,player)
                startActivity(skillIntent)
            }else{
                Toast.makeText(this,"Please select any one league!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}