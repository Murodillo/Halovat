package uz.halovat.halovat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.main_toolbar.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        iv_menu.setOnClickListener {
            val intent = Intent(this, NavigationMenuActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)
        }

    }

}