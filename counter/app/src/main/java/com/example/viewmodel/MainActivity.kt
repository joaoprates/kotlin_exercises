package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var textCounter: EditText
    lateinit var btnData: Button
    lateinit var btnShow: Button
    lateinit var mViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initData()
        initClick()
    }

    private fun initData() {
        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        textCounter = findViewById(R.id.txtCounter)
        btnData = findViewById(R.id.btnData)
        btnShow = findViewById(R.id.btnShow)

        mViewModel.mCounter.observe(this, Observer {
            value -> textCounter.setText(value)
        })
    }

    private fun initClick() {
        btnData.setOnClickListener {
            mViewModel.Counter()
        }

        btnShow.setOnClickListener {
            Toast.makeText(applicationContext, "Counter value: ${mViewModel.mCounter.value}",
                Toast.LENGTH_SHORT).show()
        }
    }


}