package com.ayush.learningfragmentsnav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.ayush.learningfragmentsnav.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        //initialsing view binding
       binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //we using our navigation graph here as fragment with Home as starting point
        //adding navigation stuff
        val navController= this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController)
    }

    //Adding action bar UP button
    override fun onSupportNavigateUp(): Boolean {
        val navController =  this.findNavController(R.id.myNavHostFragment)
        return navController.navigateUp()

    }
}