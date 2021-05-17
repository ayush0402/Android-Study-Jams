package com.ayush.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ayush.navigationdrawer.databinding.FragmentMainBinding
import com.ayush.navigationdrawer.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment + viewbinding

        val binding: FragmentSecondBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_second,container,false
        )




        return binding.root
    }


}