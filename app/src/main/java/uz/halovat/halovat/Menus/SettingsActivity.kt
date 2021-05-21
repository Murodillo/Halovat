package uz.halovat.halovat.Menus

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_settings.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class SettingsActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }

        ll_region_selection.setOnClickListener(this)
        ll_feedback.setOnClickListener(this)
        ll_lang_selection.setOnClickListener(this)
        ll_share.setOnClickListener(this)


    }

    override fun onClick(p0: View?) {

        var intent = Intent()

        when(p0?.id) {
            R.id.ll_region_selection -> intent = Intent(this, RegionSelectionActivity::class.java)
            R.id.ll_lang_selection -> intent = Intent(this, LangSelectionActivity::class.java)
            R.id.ll_feedback -> intent = Intent(this, FeedbackActivity::class.java)
            R.id.ll_share -> shareApp()
            else -> shareApp()
        }


        startActivity(intent)
        overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)
    }

    internal fun shareApp() {
        val myIntent = Intent(Intent.ACTION_SEND)
        myIntent.type = "type/palin"
        val shareBody = "Halovat"
        val shareSub = "Sizga halovat ulashamiz"
        myIntent.putExtra(Intent.EXTRA_SUBJECT , shareBody)
        myIntent.putExtra(Intent.EXTRA_TEXT , shareSub)
        startActivity(Intent.createChooser(myIntent,"Halovat"))
    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }

}