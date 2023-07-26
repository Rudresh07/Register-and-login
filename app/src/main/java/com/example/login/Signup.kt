package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login.databinding.ActivityMainBinding
import com.example.login.databinding.ActivitySignupBinding

class Signup : AppCompatActivity() {

    private var binding : ActivitySignupBinding? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignupBinding.inflate(layoutInflater)
        val view = binding?.root

        setContentView(view)


        binding?.submit?.setOnClickListener {
            Toast.makeText(this, "registration successful", Toast.LENGTH_SHORT).show()
        }

        binding?.ExistingUser?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}