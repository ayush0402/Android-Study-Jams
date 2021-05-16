package com.ayush.learningfragmentsnav

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI

import com.ayush.learningfragmentsnav.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // initialising view binding
       val binding: FragmentHomeBinding = DataBindingUtil.inflate(
               inflater, R.layout.fragment_home,container,false
       )


        binding.button.setOnClickListener { view:View->
            //binding.text.text="Button Pressed!"
            //Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_secondFragment)
            //navigation- jeetpacktx function below


            //use thisw when you just have to switch fragments
            view.findNavController().navigate(R.id.action_homeFragment_to_secondFragment)


            //use this when have to pass arguments as well using safe args (pass arguments in action()
           // view.findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToSecondFragment(input.toString()))
        }

        //set value of menu as true
        setHasOptionsMenu(true)

        return binding.root
    }
    //Inflating Menu on Home Fragment
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.overflow_menu,menu)
    }
    //When option is selected on the Menu

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController()) || super.onOptionsItemSelected(item)
    }
}