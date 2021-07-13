package com.ayush.intentsharing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.ayush.intentsharing.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //initialising view binding
         binding= DataBindingUtil.setContentView(this,R.layout.activity_main)

        //we using our navigation graph here as fragment with Home as starting point

    }
}