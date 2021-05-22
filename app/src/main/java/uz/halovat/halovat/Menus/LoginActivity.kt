package uz.halovat.halovat.Menus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }

        cv_send.setOnClickListener {
           val intent = Intent(this, CodeConfirmationActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)
        }


    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }


}