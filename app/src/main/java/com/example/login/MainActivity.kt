package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding?.root

        setContentView(view)

        binding?.newUser?.setOnClickListener {
            val intent = Intent(this,Signup::class.java)
            startActivity(intent)
        }

        binding?.login?.setOnClickListener {
            Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show()
        }
    }
}