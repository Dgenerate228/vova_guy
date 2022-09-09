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
        binding = ActivitySecondBinding.inflate(layoutInflater).also { setContentView(it.root) }
        binding.secondTextVIew.findViewById<TextView>(R.id.secondTextVIew).also { onGet() }
        binding.backButton.setOnClickListener { onClick() }
    }

    private fun onGet() {
        binding.secondTextVIew.setText(intent.getCharSequenceExtra(EDIT_COUNT))
    }

    private fun onClick() {

        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra(MainActivity.KEY_BUTTON, binding.secondTextVIew.text)
        startActivity(intent)

    }

    companion object {
        const val EDIT_COUNT = "EDIT_COUNT"
    }


}