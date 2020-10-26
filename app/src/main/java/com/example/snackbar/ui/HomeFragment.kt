package com.example.snackbar.ui

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.snackbar.R
import com.example.snackbar.`interface`.ContractMainActivity
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {
    private lateinit var cma: ContractMainActivity
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view: View = inflater.inflate(R.layout.fragment_home, container, false)

        view.btn_details.setOnClickListener {
            cma.callFragDetail()
        }
        return view
    }

    companion object{
        fun newInstance() = HomeFragment()
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Toast.makeText(context, "OnCreate", Toast.LENGTH_SHORT).show()
//    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ContractMainActivity) cma = context
    }

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