package com.example.tushar.portfolio

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.graphics.Color
import android.os.Bundle
import com.example.tushar.portfolio.controller.DevPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }


    }
}