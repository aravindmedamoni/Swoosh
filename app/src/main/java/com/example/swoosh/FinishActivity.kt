package com.example.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.swoosh.models.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    lateinit var player: Player;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        displayText.text = "Looking for ${player.league} ${player.skill} league near you!"
    }
}