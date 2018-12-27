package com.example.tushar.portfolio

import android.annotation.TargetApi
import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import com.example.tushar.portfolio.view.AboutFragment
import com.example.tushar.portfolio.view.ContactFragment
import com.example.tushar.portfolio.view.SkillFragment
import com.example.tushar.portfolio.view.WorkFragment
import kotlinx.android.synthetic.main.activity_second2.*

class SecondActivity : AppCompatActivity() {

    val manager=supportFragmentManager

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {
        item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
                createfragmentabout()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                message.setText(R.string.title_dashboard)
                createfragmentskill()
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                message.setText(R.string.title_notifications)
                createfragmentwork()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }




    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second2)

        mainscreen.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        exit.setOnClickListener {
            finishAffinity()
        }


        createfragmentabout()
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
    fun createfragmentabout()
    {
        val transaction=manager.beginTransaction()
        val fragment=AboutFragment()
        transaction.replace(R.id.fragmentholder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createfragmentskill()
    {
        val transaction=manager.beginTransaction()
        val fragment=SkillFragment()
        transaction.replace(R.id.fragmentholder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun createfragmentwork()
    {
        val transaction=manager.beginTransaction()
        val fragment=WorkFragment()
        transaction.replace(R.id.fragmentholder,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}
