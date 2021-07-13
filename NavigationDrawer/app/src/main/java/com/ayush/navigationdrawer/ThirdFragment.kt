package com.ayush.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ayush.navigationdrawer.databinding.FragmentMainBinding
import com.ayush.navigationdrawer.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment + viewbinding

        val binding: FragmentThirdBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_third,container,false
        )




        return binding.root
    }


}