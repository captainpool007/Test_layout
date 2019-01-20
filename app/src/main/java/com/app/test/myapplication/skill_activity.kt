package com.app.test.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.skill_activity.*

class skill_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.skill_activity)
    }
    fun beg_onclick(view: View)
    { ball.isChecked = false

    }
    fun ball_onclick(view: View)
    { beg.isChecked= false
    }
}
