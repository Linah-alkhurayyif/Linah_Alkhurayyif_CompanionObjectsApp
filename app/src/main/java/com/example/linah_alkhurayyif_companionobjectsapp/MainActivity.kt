package com.example.linah_alkhurayyif_companionobjectsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.dayNight_bg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(Constant.TAG, "onCreate: ")

        changeBackground.setOnClickListener{

                var userinput = userinput.text?.toString()
                val Background = ChangingBackground()
                when(userinput?.toLowerCase()){
                    "day"-> Background.changingBackground(dayNight_bg,"day")
                    "night"-> Background.changingBackground(dayNight_bg,"night")
                    else->  {
                        Background.changingBackground(dayNight_bg,"nodata")
                        card.isVisible=false
                        goback.isVisible=true
                    }
                }


        }
        goback.setOnClickListener{
            card.isVisible=true
            goback.isVisible=false
            dayNight_bg.setBackgroundResource(R.drawable.d_n_bg)
        }

    }
}