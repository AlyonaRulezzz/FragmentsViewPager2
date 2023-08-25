package ru.test.testfragmentsviewpager2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.test.testfragmentsviewpager2.databinding.FragmentViewPager2Binding

class ViewPager2Fragment : Fragment() {

    lateinit var binding: FragmentViewPager2Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager2, container, false)
        binding = FragmentViewPager2Binding.bind(view)

        val viewPager2 = binding.viewPager2

        val fragments = arrayListOf<Fragment>(DuckFragment(), TanyaFragment())
        val adapter = ViewPager2Adapter(fragments, this)
        viewPager2.adapter = adapter

        return view
    }

}

class ViewPager2Adapter(val fragments: ArrayList<Fragment>, fragment: Fragment
) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}