package com.app.test.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class activity_league : AppCompatActivity() {

var player = player("","")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }
    fun toggle1(view: View)
    { toggleButton2.isChecked=false
        toggleButton3.isChecked= false
player.league="toggle1"
    }
    fun toggle2(view: View)
    {
        toggleButton3.isChecked=false
        toggleButton1.isChecked=false
        player.league="toggle2"
    }
    fun toggle3(view : View)
    {
        toggleButton1.isChecked=false
        toggleButton2.isChecked=false
        player.league="toggle3"
    }
    fun league_nextclick(view: View)
    { if(player.league!="") {
        val skill = Intent(this, skill_activity::class.java)
        skill.putExtra(EXTRA_PLAYER, player)
        startActivity(skill)
    }
        else {
        Toast.makeText(this, "Please seleact a league", Toast.LENGTH_SHORT).show()
    }
    }


}
