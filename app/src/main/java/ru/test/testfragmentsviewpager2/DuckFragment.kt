package ru.test.testfragmentsviewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.test.testfragmentsviewpager2.databinding.FragmentDuckBinding

class DuckFragment : Fragment() {

    lateinit var binding: FragmentDuckBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_duck, container, false)
        binding = FragmentDuckBinding.bind(view)
        return view
    }

}