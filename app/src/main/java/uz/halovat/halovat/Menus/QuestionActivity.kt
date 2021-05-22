package uz.halovat.halovat.Menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_question.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class QuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }


        cv_send.setOnClickListener {
            Toast.makeText(this, "Savol yo'llandi...", Toast.LENGTH_SHORT).show()
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }
}