package com.akirachix.mentorgram

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.akirachix.mentorgram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvLogin.setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }
        binding.btnRegister.setOnClickListener {
            validateRegistration()
        }

    }

    fun validateRegistration() {
        var formErr = false
        clearErrors()
        val firstName = binding.etFirstName.text.toString()
        if (firstName.isBlank()) {
            formErr = true
            binding.tilFirstName.error = "First name is required"
        }
        val lastName = binding.etFirstName.text.toString()
        if (lastName.isBlank()) {
            formErr = true
            binding.tilLastName.error = "Last name is required"
        }

        val email = binding.etEmail.text.toString()
        if (email.isBlank()) {
            formErr = true
            binding.tilEmail.error = "Email is required"
        }

        val codehive = binding.etCodehiveId.text.toString()
        if (codehive.isBlank()) {
            formErr = true
            binding.tilCodehiveId.error = "Codehive Id is required"
        }
        val username = binding.etUsername.text.toString()
        if (codehive.isBlank()) {
            formErr = true
            binding.tilUsername.error = "Username is required"
        }


        val password = binding.etPassword.text.toString()
        if (password.isBlank()) {
            formErr = true
            binding.tilPassword.error = "Password is required"
        }

        val passwordConf = binding.etPassword.text.toString()
        if (passwordConf.isBlank()) {
            formErr = true
            binding.tilConfirmPassword.error = "Password don't match"
        }
        if (password != passwordConf) {
            formErr = true
            binding.tilConfirmPassword.error = "Passwords don't match"
        }
        if (!formErr) {
//            Proceed to registration
        }
    }

    fun clearErrors() {
        binding.tilFirstName.error = null
        binding.tilLastName.error = null
        binding.tilEmail.error = null
        binding.tilCodehiveId.error = null
        binding.tilUsername.error = null
        binding.tilPassword.error = null
        binding.tilConfirmPassword.error = null
    }
}

