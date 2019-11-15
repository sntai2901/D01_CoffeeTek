package com.example.d01_coffeetek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_login.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        backButton.setOnClickListener {
            val intent = Intent(this, Onboarding::class.java)
            // start your next activity
            startActivity(intent)
        }
    }



}
