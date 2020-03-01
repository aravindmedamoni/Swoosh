package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SkillSelectionScreen : AppCompatActivity() {

    var league = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_selection_screen)
        league = intent.getStringExtra(EXTRA_LEAGUE)

    }
}