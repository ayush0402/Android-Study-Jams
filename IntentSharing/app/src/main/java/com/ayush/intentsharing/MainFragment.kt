package com.ayush.intentsharing

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import com.ayush.intentsharing.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //initilaising viewbinding

        val binding: FragmentMainBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main,container,false
        )

        binding.sharebtn.setOnClickListener {
            val shareIntent=Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain").putExtra(Intent.EXTRA_TEXT, "Hello how are you? I am sending this text via an INTENT on my app")
            startActivity(shareIntent)
        }

        //setting menu active
        setHasOptionsMenu(true)



        return binding.root
    }
    //inflating menu on mainFragment

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu,menu)
    }

    //menu item selected
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //val texttosend="How are you? I am sending this message by creating an INTENT via my app."
        when(item!!.itemId){
                R.id.share -> {
                    val shareIntent=Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain").putExtra(Intent.EXTRA_TEXT, "Hello how are you? I am sending this text via an INTENT on my app")
                    startActivity(shareIntent)
                }
            }
        return super.onOptionsItemSelected(item)
    }
}