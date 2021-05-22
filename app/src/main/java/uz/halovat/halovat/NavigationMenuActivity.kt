package uz.halovat.halovat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.r0adkll.slidr.Slidr
import com.r0adkll.slidr.model.SlidrInterface
import kotlinx.android.synthetic.main.activity_navigation_menu.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.Menus.*

class NavigationMenuActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var slidr: SlidrInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_menu)

        slidr = Slidr.attach(this)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""

        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }

        cv_sozlamalar.setOnClickListener(this)
        cv_qibla.setOnClickListener(this)
        cv_tasbeh.setOnClickListener(this)
        cv_yaqin_masjidlar.setOnClickListener(this)
        cv_profil.setOnClickListener(this)

    }


    override fun onClick(p0: View?) {
        var intent = Intent()

        when (p0?.id) {
            R.id.cv_sozlamalar ->
                intent = Intent(this, SettingsActivity::class.java)
            R.id.cv_yaqin_masjidlar ->
                intent = Intent(this, MosqueInfoActivity::class.java)
            R.id.cv_qibla ->
                intent = Intent(this, QiblaActivity::class.java)
            R.id.cv_tasbeh ->
                intent = Intent(this, TasbehActivity::class.java)
            R.id.cv_profil ->
                intent = Intent(this, LoginActivity::class.java)
            else -> Intent(this, TasbehActivity::class.java)
        }

        startActivity(intent)
        overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)

    }


    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }

    fun lock() {
        slidr.lock()

    }

    fun unlock() {
        slidr.unlock()

    }


}