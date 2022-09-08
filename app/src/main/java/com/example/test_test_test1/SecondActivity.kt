package com.example.test_test_test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.test_test_test1.databinding.ActivitySecondBinding


class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater).also {setContentView(it.root)}
        binding.secondTextVIew.findViewById<TextView>(R.id.secondTextVIew). also { onGet() }
        }
    private fun onGet() {
        binding.secondTextVIew.setText(intent.getCharSequenceExtra(EDIT_COUNT))
    }
    companion object {
        const val EDIT_COUNT = "EDIT_COUNT"
    }


}