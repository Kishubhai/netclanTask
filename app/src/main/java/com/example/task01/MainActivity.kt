package com.example.task01

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ProgressBar
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewPager =findViewById<ViewPager>(R.id.viewPager)
        var tablayout= findViewById<TabLayout>(R.id.tablayout)

        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        fragmentAdapter.addFragment(PersonalFragment(),"Personal")
        fragmentAdapter.addFragment(BussinessFragment(),"Bussiness")
        fragmentAdapter.addFragment(MerchantFragment(),"Merchant")

        viewPager.adapter = fragmentAdapter
        tablayout.setupWithViewPager(viewPager)






    }
    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {


        R.id.refine_button01 -> {
            // User chose the "Favorite" action, mark the current item
            // as a favorite...
            intent= Intent(applicationContext,refinee::class.java)
            startActivity(intent)
            true
        }

        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }
}