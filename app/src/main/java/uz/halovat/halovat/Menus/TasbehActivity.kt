package uz.halovat.halovat.Menus

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_tasbeh.*
import kotlinx.android.synthetic.main.menu_toolbar.*
import uz.halovat.halovat.R

class TasbehActivity : AppCompatActivity() {
    var score = 0
    var RepeatScore = 0
    var counter33 = true
    var counter99 = false
    var counterInfinity = false
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeh)
        setSupportActionBar(toolbarformenu)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = ""
        toolbarformenu.setNavigationOnClickListener {
            onBackPressed()
        }
        target33.setTextColor(R.color.selected_color)

        target33.setOnClickListener {
            if (counter33) {

            } else {
                counter33 = true
                counter99 = false
                counterInfinity = false
                RepeatScore = 0
                score = 0
                counter.text = "0"
                loop.text = "0"
                refreshColors()
                target33.setTextColor(R.color.selected_color)
            }

        }
        target100.setOnClickListener {
            if (counter99) {

            } else {
                refreshColors()
                target100.setTextColor(R.color.selected_color)

                counter33 = false
                counter99 = true
                counterInfinity = false
                RepeatScore = 0
                score = 0
                counter.text = "0"
                loop.text = "0"
            }
        }
        targetInfinity.setOnClickListener {
            if (counterInfinity) {

            } else {
                refreshColors()
                targetInfinity.setTextColor(R.color.selected_color)
                counter33 = false
                counter99 = false
                counterInfinity = true
                RepeatScore = 0
                score = 0
                counter.text = "0"
                loop.text = "0"
            }

        }

        btn_touch.setOnClickListener {
            score++
            counter.text = "$score"
            if (counter33) {
                if (score % 33 == 0) {
                    RepeatScore++
                    loop.text = "$RepeatScore"
                }
            }
            if (counter99) {
                if (score % 99 == 0) {
                    RepeatScore++
                    loop.text = "$RepeatScore"
                }
            }


        }
        refresh.setOnClickListener {
            score = 0
            RepeatScore = 0
            counter.text = "0"
            loop.text = "0"

        }
    }


    @SuppressLint("ResourceAsColor")
    fun refreshColors() {
        target33.setTextColor(R.color.calendarColor)
        target100.setTextColor(R.color.calendarColor)
        targetInfinity.setTextColor(R.color.calendarColor)

    }



}