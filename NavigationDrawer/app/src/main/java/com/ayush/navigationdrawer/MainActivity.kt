package com.ayush.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.ayush.navigationdrawer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //creating variable for Navigation Drawer
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //initialsing view binding
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //initialising nav drawer from main binding
        drawerLayout = binding.drawerLayout

        //adding navigation controller for up button with Nav Drawer
        //also passing drawerLayout as parameter to navController
        val navController= this.findNavController(R.id.myNavHostFragment)
        NavigationUI.setupActionBarWithNavController(this,navController,drawerLayout)
        NavigationUI.setupWithNavController(binding.navView,navController)

       // appBarConfiguration = AppBarConfiguration(navController.graph, drawerLayout)
    }

    //Adding action bar UP button
    override fun onSupportNavigateUp(): Boolean {
        val navController = this.findNavController(R.id.myNavHostFragment)

        //udacity's course has a mistake with parameters reversed.
        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}