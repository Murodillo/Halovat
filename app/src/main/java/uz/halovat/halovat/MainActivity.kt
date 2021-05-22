package uz.halovat.halovat

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.main_toolbar.*
import uz.halovat.halovat.Model.DateModel
import java.util.*

class MainActivity : AppCompatActivity() {

    var isNight = false

    var dateOfToday: DateModel? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        setDateToToday()

        iv_menu.setOnClickListener {
            val intent = Intent(this, NavigationMenuActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.anim_right_to_left, R.anim.anim_left_to_right)
        }




        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            isNight = true
        }
        iv_dark_mode.setOnClickListener {
            if (!isNight) {
                isNight = true
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

            } else {
                isNight = false
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

            }
        }


        btn_calendar.setOnClickListener {

            DatePickerDialog(this, DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->

            }, dateOfToday!!.year, dateOfToday!!.month, dateOfToday!!.day).show()
        }

    }


    internal fun setDateToToday() {
        val calendar = Calendar.getInstance()
        dateOfToday = DateModel(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH))


    }




}