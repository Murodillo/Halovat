package uz.halovat.halovat.Menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }
        cv_logout.setOnClickListener {
            onBackPressed()
        }

        cv_save.setOnClickListener {
            onBackPressed()
            Toast.makeText(this, "Saqlandi...", Toast.LENGTH_SHORT).show()
        }


    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }
}