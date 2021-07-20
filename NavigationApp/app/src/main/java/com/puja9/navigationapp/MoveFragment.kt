package com.puja9.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class MoveFragment : Fragment() {

    lateinit var move: Button

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_move, container, false)

        move = view.findViewById(R.id.move_to_camera_btn)

        move.setOnClickListener {
            val fr: FragmentTransaction = parentFragmentManager.beginTransaction()
            fr.replace(R.id.fragment_container, CameraFragment())
            fr.commit()
        }
        return view
    }
}