package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.utilities.EXTRA_LEAGUE
import com.example.swoosh.utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill_selection_screen.*

class SkillSelectionScreen : AppCompatActivity() {

    var league = ""
    var skill = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_selection_screen)
        league = intent.getStringExtra(EXTRA_LEAGUE)

        beginnerToggleButton.setOnClickListener {
            ballerToggleButton.isChecked = false
            skill = "Beginner"
        }

        ballerToggleButton.setOnClickListener {
            beginnerToggleButton.isChecked = false
            skill = "Baller"
        }
        finishButton.setOnClickListener {
            if(skill != ""){
                val finishIntent = Intent(this,FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_SKILL,skill)
                startActivity(finishIntent)
            }
        }
    }
}