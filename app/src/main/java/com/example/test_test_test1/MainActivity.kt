package com.example.test_test_test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.test_test_test1.databinding.ActivityMainBinding
import com.example.test_test_test1.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also {setContentView(it.root)}

        binding.mainButton.setOnClickListener { onClick() }
    }
        fun onClick() {
           val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra(SecondActivity.EDIT_COUNT, binding.mainEdit.text)
            startActivity(intent)
        }



    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        super.onResume()
    }
    }
