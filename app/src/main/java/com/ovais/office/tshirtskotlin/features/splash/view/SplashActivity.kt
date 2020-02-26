package com.ovais.office.tshirtskotlin.features.splash.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.ovais.office.tshirtskotlin.R
import com.ovais.office.tshirtskotlin.features.tshirts.view.TShirtActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        startSplash()

    }

    private fun startSplash() {

        val handler = Handler()
        val runnable = Runnable {

            val intent = Intent(this, TShirtActivity::class.java)
            startActivity(intent)

        }
        handler.postDelayed(runnable, 3000)

    }
}
