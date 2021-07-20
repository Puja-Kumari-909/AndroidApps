package com.puja9.navigationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_nav)

        val firstFragment = HomeFragment()
        val secondFragment = CameraFragment()
        val thirdFragment = MoveFragment()
        val forthFragment = UserFragment()

        setCurrentFragment(firstFragment)

        bottomNavigationView.setOnItemReselectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(firstFragment)
                R.id.camera->setCurrentFragment(secondFragment)
                R.id.move->setCurrentFragment(thirdFragment)
                R.id.user->setCurrentFragment(forthFragment)
            }
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_container, fragment)
            commit()
        }
}