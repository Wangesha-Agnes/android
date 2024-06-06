package com.akirachix.mentorgram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorgram.databinding.ActivityLoginBinding
import com.akirachix.mentorgram.databinding.ActivityMainBinding

class Login : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    fun validateLogin(){
        var formError = false
        val userName = binding.etUserName.text.toString()
        if (userName.isBlank()){
            formError = true
            binding.tilUserName.error="Username is required"
        }
        val password = binding.etPassword.text.toString()
        if (password.isBlank()){
            formError = true
            binding.tilpassword.error="Password is required"
        }
    }

}
