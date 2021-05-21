package uz.halovat.halovat.Menus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_region_selection.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.Adapter.RegionAdapter
import uz.halovat.halovat.BaseActivity
import uz.halovat.halovat.R

class RegionSelectionActivity : AppCompatActivity() {

    val regions: ArrayList<String> = arrayListOf("Andijon", "Namangan", "Farg'ona", "Toshkent", "Guliston", "Sirdaryo", "Jizzax", "Samarqand", "Buxoro", "Xorazm")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_region_selection)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }

        val adapter = RegionAdapter(this, regions)
        lv_regions.adapter = adapter

        lv_regions.setOnItemClickListener { adapterView, view, i, l ->
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.anim_left_to_right_exit, R.anim.anim_right_to_left_exit)

    }

}