package com.example.final_project

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        easyBtn.setOnClickListener {
            val intent  = Intent(this,EasyActivity::class.java)
            startActivity(intent)
        }

        helpBtn.setOnClickListener {
            val intent  = Intent(this,HelpActivity::class.java)
            startActivity(intent)
        }

        settingsBtn.setOnClickListener {
            val intent  = Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }

    }
}