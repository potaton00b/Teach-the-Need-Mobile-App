package com.teach.teachtheneed.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teach.teachtheneed.R
import com.teach.teachtheneed.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    val context = this
    lateinit var bin: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bin = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bin.root)

        bin.btnLogin.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }


    }
}