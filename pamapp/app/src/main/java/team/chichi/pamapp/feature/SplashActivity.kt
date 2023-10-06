package team.chichi.pamapp.feature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import team.chichi.pamapp.R
import team.chichi.pamapp.feature.SNSLogin.Views.LoginActivity

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var handler: Handler? = null
        val thread = Thread {

            handler = Handler(Looper.getMainLooper())

            handler!!.postDelayed(Runnable {
                val intent = Intent(this@SplashActivity, LoginActivity::class.java)
                startActivity(intent)
            }, 500)

        }
        thread.start()
    }


}