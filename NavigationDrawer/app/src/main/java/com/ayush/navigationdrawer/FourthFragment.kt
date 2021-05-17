package com.ayush.navigationdrawer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.ayush.navigationdrawer.databinding.FragmentFourthBinding
import com.ayush.navigationdrawer.databinding.FragmentSecondBinding


class FourthFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding: FragmentFourthBinding = DataBindingUtil.inflate(
                inflater, R.layout.fragment_fourth,container,false
        )




        return binding.root
    }


}