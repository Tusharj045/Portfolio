package com.example.tushar.portfolio

import android.annotation.TargetApi
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.graphics.Color
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import com.example.tushar.portfolio.controller.DevPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_second2.*


class MainActivity : AppCompatActivity() {

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button2.setOnClickListener {
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
        exitButton.setOnClickListener{
            finishAffinity()
        }
        cardView.setOnClickListener{
            makePhoneCall("9999999999")
            //Add the number in the above string on which you want to make a call.
        }
    }

    //Function for making phone calls
    fun Context.makePhoneCall(number: String) : Boolean {
        try {
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$number"))
            startActivity(intent)
            return true
        } catch (e: Exception) {
            e.printStackTrace()
            return false
        }
    }
}