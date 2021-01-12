package com.example.jobly

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup




class FavoritesFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_favorites, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            FavoritesFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}