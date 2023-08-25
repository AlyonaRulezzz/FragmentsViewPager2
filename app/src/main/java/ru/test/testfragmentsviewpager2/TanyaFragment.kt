package ru.test.testfragmentsviewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.test.testfragmentsviewpager2.databinding.FragmentTanyaBinding

class TanyaFragment : Fragment() {

    lateinit var binding: FragmentTanyaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tanya, container, false)
        binding = FragmentTanyaBinding.bind(view)
        return view
    }

}