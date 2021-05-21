package uz.halovat.halovat.Menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_lang_selection.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class LangSelectionActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lang_selection)

        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }

        tv_krill.setOnClickListener(this)
        tv_rus.setOnClickListener(this)
        tv_uzbek.setOnClickListener(this)

    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }

    override fun onClick(p0: View?) {
        onBackPressed()
    }


}