package com.example.lab1kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 0
        var increment = 1
        var goalNum = 100
        findViewById<Button>(R.id.btnPress).setOnClickListener {
            var num = findViewById<TextView>(R.id.tvTextBox)
            var goal = findViewById<TextView>(R.id.tvGoal)
            goalNum -= 1
            goal.text = "Goal: $goalNum"
            x += increment


            num.text = x.toString();
            if (x == 100) {
                goal.text = "GOAL!"
                goal.isVisible = false
                Toast.makeText(this, "Yayyy Scored 100!",Toast.LENGTH_SHORT).show()
                increment = 2
                val btnAdditionalInfo = findViewById<Button>(R.id.tvAdditionalTextBox)
                btnAdditionalInfo.isVisible = true
                btnAdditionalInfo.setOnClickListener {
                    btnAdditionalInfo.isVisible = false
                }
            }
        }
    }
}