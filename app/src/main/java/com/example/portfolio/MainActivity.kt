 package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val and var used to declare variable

        val buttonSkills = findViewById<Button>(R.id.button)

        buttonSkills.setOnClickListener{
            intent = Intent(this, SkillsActivity::class.java)
            //there are two types of intent implicit and explicit intent
            startActivity(intent) //New page will open with this line
        }

        val buttonEducation = findViewById<Button>(R.id.button2)

        buttonEducation.setOnClickListener {
            intent = Intent(this, EducationDetail::class.java)
            startActivity(intent) //New page will open with this line
        }

        val buttonAchivement = findViewById<Button>(R.id.button4)

        buttonAchivement.setOnClickListener {
            intent = Intent(this, Achivement::class.java)
            startActivity(intent) //New page will open with this line
        }

        val buttonWork = findViewById<Button>(R.id.button3)

        buttonWork.setOnClickListener {
            intent = Intent(this, Work::class.java)
            startActivity(intent) //New page will open with this line
        }


    }
}