package ru.test.testfragmentsviewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.test.testfragmentsviewpager2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val viewPager2 = binding.viewPager2

        val fragments = arrayListOf<Fragment>(DuckFragment(), TanyaFragment())
        val adapter = ViewPager2Adapter(fragments, this)
        viewPager2.adapter = adapter

    }

}

class ViewPager2Adapter(val fragments: ArrayList<Fragment>,
                    activity: AppCompatActivity
                    ) : FragmentStateAdapter(activity) {
    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}
