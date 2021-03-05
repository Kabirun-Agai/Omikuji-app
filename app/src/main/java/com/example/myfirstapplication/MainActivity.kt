package com.example.myfirstapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
//            Log.v("MainActivity","Button Clicked")
            val results = arrayOf("大吉","吉", "中吉", "小吉", "凶")
//            val n = Random().nextInt(5)
            val n = Random().nextInt(results.count())

            if (n == 0){
//                resulttextView.setTextColor(Color.RED)
//                resulttextView.setTextColor(Color.parseColor("#ff0000"))
                resulttextView.setTextColor(Color.argb(255 , 255 , 0 , 0))
            }else{
                resulttextView.setTextColor(Color.parseColor("#808080"))
            }

            resulttextView.text = results.get(n)
        }
    }


}