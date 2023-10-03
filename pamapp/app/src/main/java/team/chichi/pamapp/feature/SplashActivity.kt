package team.chichi.pamapp.feature

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import team.chichi.pamapp.feature.SNSLogin.Views.LoginActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(team.chichi.pamapp.R.layout.activity_splash)

        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3초 있다 메인액티비티로
    }

    override fun onPause() {
        super.onPause()
        finish()
    }
}