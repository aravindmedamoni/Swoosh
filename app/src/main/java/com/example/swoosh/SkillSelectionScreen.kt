package com.example.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.example.swoosh.models.Player
import com.example.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill_selection_screen.*

class SkillSelectionScreen : AppCompatActivity() {

     lateinit var player: Player;
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill_selection_screen)

        player = intent.getParcelableExtra(EXTRA_PLAYER)

        beginnerToggleButton.setOnClickListener {
            ballerToggleButton.isChecked = false
            player.skill = "Beginner"
        }

        ballerToggleButton.setOnClickListener {
            beginnerToggleButton.isChecked = false
            player.skill = "Baller"
        }
        finishButton.setOnClickListener {
            if(player.skill != ""){
                val finishIntent = Intent(this,FinishActivity::class.java)
                finishIntent.putExtra(EXTRA_PLAYER,player)
                startActivity(finishIntent)
            }else{
                Toast.makeText(this,"please select skill!",Toast.LENGTH_SHORT).show()
            }
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable<Player>(EXTRA_PLAYER)!!
        }
    }
}