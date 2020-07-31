package com.binar.fragmentintentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.binar.fragmentintentapp.fragments.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        this.supportActionBar?.hide()

        val bundleFragment = BundleFragment()
        val serializableFragment = SerializableFragment()
        val parcelableFragment = ParcelableFragment()
        val explicitFragment= ExplicitFragment()
        val implicitFragment = ImplicitFragment()

        if (savedInstanceState == null) {
            makeCurrentFragment(bundleFragment)
            bottom_navigation.setItemSelected(R.id.bundle)
        }

        bottom_navigation.setOnItemSelectedListener() {id ->
            when (id) {
                R.id.bundle -> makeCurrentFragment(bundleFragment)
                R.id.serializable -> makeCurrentFragment(serializableFragment)
                R.id.parcelable -> makeCurrentFragment(parcelableFragment)
                R.id.explicit -> makeCurrentFragment(explicitFragment)
                R.id.implicit -> makeCurrentFragment(implicitFragment)
            }
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.cl_content, fragment)
            commit()
        }


}