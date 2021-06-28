package com.puja9.listviewapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.puja9.listviewapp.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val about = intent.getStringExtra("about")
        val imageId = intent.getIntExtra("imageId", R.drawable.java)

        binding.profileImage.setImageResource(imageId)
        binding.about.text = about

    }
}