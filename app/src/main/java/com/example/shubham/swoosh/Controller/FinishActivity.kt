package com.example.shubham.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.shubham.swoosh.Model.Player
import com.example.shubham.swoosh.R
import com.example.shubham.swoosh.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} near you..."
    }
}
