package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setListeners(){

        val boxOneText= findViewById<TextView>(R.id.box_one_text)
        val boxTwoText= findViewById<TextView>(R.id.box_two)
        val boxThreeText= findViewById<TextView>(R.id.box_three_text)
        val boxfourText= findViewById<TextView>(R.id.box_four)
        val boxfiveText= findViewById<TextView>(R.id.box_five)

    val rootConstraintLayout=findViewById<View>(R.id.constraint_layout)
    val clickableViews: List<View> =
        listOf(

            boxOneText,boxTwoText,boxThreeText,
            boxfourText,boxfiveText,rootConstraintLayout
        )
        for(item in clickableViews){
            item.setOnClickListener{
                makeColored(it)
        }
        }

    }

private fun makeColored(view: View) {
    when (view.id) {
        R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
        R.id.box_two -> view.setBackgroundColor(Color.GRAY)
        R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
        R.id.box_four -> view.setBackgroundColor(Color.YELLOW)
        R.id.box_five -> view.setBackgroundColor(Color.MAGENTA)
        else ->
            view.setBackgroundColor(Color.LTGRAY)

    }

}
}

