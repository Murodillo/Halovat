package uz.halovat.halovat.Menus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mosque_info.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class MosqueInfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mosque_info)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Xarita"
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }


        cv_aloqa.setOnClickListener {
            val intent = Intent(this, QuestionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }


}