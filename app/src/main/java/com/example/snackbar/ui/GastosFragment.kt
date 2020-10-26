package com.example.snackbar.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.snackbar.R

class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_gastos, container, false)
    }
    companion object{
        fun newInstance() = GastosFragment()
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Toast.makeText(context, "OnCreate", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        Toast.makeText(context, "OnAttach", Toast.LENGTH_SHORT).show()
//    }
//
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        Toast.makeText(context, "OnActivityCreate", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Toast.makeText(context, "OnStart", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Toast.makeText(context, "OnResume", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Toast.makeText(context, "OnPause", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Toast.makeText(context, "OnStop", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroyView() {
//        super.onDestroyView()
//        Toast.makeText(context, "OnDestroyView", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Toast.makeText(context, "OnDestroy", Toast.LENGTH_SHORT).show()
//    }
//
//    override fun onDetach() {
//        super.onDetach()
//        Toast.makeText(context, "OnDetach", Toast.LENGTH_SHORT).show()
//    }
}