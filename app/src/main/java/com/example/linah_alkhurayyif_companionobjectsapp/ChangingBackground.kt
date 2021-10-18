package com.example.linah_alkhurayyif_companionobjectsapp

import android.view.View

class ChangingBackground {
    companion object {
     val userInput = ""
    }
   fun changingBackground(layout: View,userinput:String){
       when (userinput){
           "night"->{layout.setBackgroundResource(R.drawable.night)}
           "day"->{layout.setBackgroundResource(R.drawable.day)}
           "nodata"->{layout.setBackgroundResource(R.drawable.nodata)}
   }
}}