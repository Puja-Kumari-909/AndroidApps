package com.puja9.listviewapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.puja9.listviewapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.java, R.drawable.kotlin,R.drawable.dart,R.drawable.javascript,
            R.drawable.python,R.drawable.cplusplus
        )

        val name = arrayOf(
            "Java",
            "Kotlin",
            "Dart",
            "Javascript",
            "Python",
            "C++"
        )

        val about = arrayOf(
            "JAVA",
            "Kotlin",
            "Dart",
            "Javascript",
            "Python",
            "C++"
        )

        userArrayList = ArrayList()

        for(i in name.indices){
            val user = User(
                name[i],
                about[i],
                imageId[i]
            )
            userArrayList.add(user)
        }

        binding.listOfItems.isClickable = true
        binding.listOfItems.adapter = Adapter(this,userArrayList)
        binding.listOfItems.setOnItemClickListener { parent, view, position, id ->

            val about = about[position]
            val imageId = imageId[position]

            val i = Intent(this,UserActivity::class.java)

            i.putExtra("about", about)
            i.putExtra("imageId", imageId)
            startActivity(i)

        }
    }
}