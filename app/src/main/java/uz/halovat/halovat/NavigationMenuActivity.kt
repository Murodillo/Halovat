package uz.halovat.halovat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.menu_toolbar.*

class NavigationMenuActivity : AppCompatActivity() {

    lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_menu)
        slidr = Slidr.attach(this)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_right_to_left_exit, R.anim.anim_left_to_right_exit)

    }

    fun lock(){
        slidr.lock()

    }
    fun unlock(){
        slidr.unlock()

    }


}