package com.teach.teachtheneed.Activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import com.teach.teachtheneed.Utils.Func
import com.teach.teachtheneed.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    val context = this
    lateinit var bin: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Func.hideSystemUI(context as Activity)
        bin = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(bin.root)

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

        // handler
        Handler(Looper.getMainLooper()).postDelayed({
            // here is your code
            goToLogin()
        }, 2000)

    }

    private fun goToLogin() {
        val intent = Intent(context, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
    }
}