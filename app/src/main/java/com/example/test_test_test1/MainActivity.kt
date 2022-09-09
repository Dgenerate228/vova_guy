package com.example.test_test_test1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import com.example.test_test_test1.databinding.ActivityMainBinding
import com.example.test_test_test1.databinding.ActivitySecondBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).also { setContentView(it.root) }
        binding.mainEdit.findViewById<TextView>(R.id.mainTextView).also { onGetMain() }
        binding.mainButton.setOnClickListener { onClick() }
    }

    private fun onGetMain() {
        binding.mainTextView.setText(intent.getCharSequenceExtra(KEY_BUTTON))
    }

    fun onClick() {
        val intent = Intent(this, SecondActivity::class.java)
        intent.putExtra(SecondActivity.EDIT_COUNT, binding.mainEdit.text)
        startActivity(intent)
    }

    companion object {
        const val KEY_BUTTON = "KEY_BUTTON"

    }
}
