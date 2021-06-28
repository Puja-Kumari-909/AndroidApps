package com.puja9.listviewapp

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(private val context: Activity, private val arrayList: ArrayList<User>) : ArrayAdapter<User>(context,
              R.layout.list_items, arrayList) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater : LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.list_items,null)

        val imageView : ImageView = view.findViewById(R.id.profilePic)
        val languageName : TextView = view.findViewById(R.id.nameOfTheLanguage)

        imageView.setImageResource(arrayList[position].imgeId)
        languageName.text = arrayList[position].name

        return view
    }
}