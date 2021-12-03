package com.example.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PrimeiroFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrimeiroFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_primeiro, container, false)

        val buttonNavFirst = view.findViewById<Button>(R.id.second)

        buttonNavFirst.setOnClickListener{

            Navigation.findNavController(view).navigate(R.id.SegundoFragToFirst)

        }

        return view
    }

}