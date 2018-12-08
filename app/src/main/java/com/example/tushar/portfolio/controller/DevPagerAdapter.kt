package com.example.tushar.portfolio.controller

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.example.tushar.portfolio.view.AboutFragment
import com.example.tushar.portfolio.view.ContactFragment
import com.example.tushar.portfolio.view.SkillFragment
import com.example.tushar.portfolio.view.WorkFragment

class DevPagerAdapter(fragmentManager: FragmentManager):FragmentPagerAdapter(fragmentManager){
    override fun getItem(position: Int): Fragment? {
        when(position) {
            0 -> return AboutFragment()
            1 -> return WorkFragment()
            2 -> return SkillFragment()
            3 -> return ContactFragment()
        }
        return null
    }

    override fun getCount(): Int {
        return 4
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> return "ABOUT"
            1 -> return "WORK"
            2 -> return "SKILLS"
            3 -> return "CONTACT"
        }

        return null

    }


}