package com.example.snackbar.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.snackbar.R
import com.example.snackbar.`interface`.ContractMainActivity
import kotlinx.android.synthetic.main.fragment_detail_gastos.view.*

class DetailGastosFragment : Fragment() {
    private var msg = ""

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view:View =  inflater.inflate(R.layout.fragment_detail_gastos, container, false)
        view.text_details.text = msg
        return view

    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        arguments?.getString("key")?.let{
            msg = it
        }
    }
    companion object{
        @JvmStatic
        fun newInstance(msg: String) = DetailGastosFragment().apply {
            arguments = Bundle().apply {
                putString("key", msg)
            }
        }
    }



}