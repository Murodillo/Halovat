package uz.halovat.halovat.Menus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_code_confirmation.*
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class CodeConfirmationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_code_confirmation)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }

        startTimer()

        cv_confirm.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)
        }

        tv_send_again.setOnClickListener {
            Toast.makeText(this, "Qayta jo'naldi", Toast.LENGTH_SHORT).show()
            tv_send_again.visibility = View.GONE
        }


    }

    fun startTimer() {
        val timer = object: CountDownTimer(120000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                tv_time.text = getTimerText(millisUntilFinished.toDouble() / 1000)
            }

            override fun onFinish() {

            }
        }
        timer.start()
    }

    private fun getTimerText(time: Double): String {
        val rounded = Math.round(time).toInt()
        val seconds = rounded % 86400 % 3600 % 60
        val minutes = rounded % 86400 % 3600 / 60
        return formatTime(seconds, minutes)
    }


    private fun formatTime(seconds: Int, minutes: Int): String {
        return String.format(
            "%02d",
            minutes
        ) + " : " + String.format("%02d", seconds)
    }



    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }

}