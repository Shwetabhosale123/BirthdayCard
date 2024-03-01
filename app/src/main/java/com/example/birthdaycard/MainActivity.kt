package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
   lateinit var inputText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        inputText=findViewById(R.id.nameInput)

        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener{
           //val text=inputText.text.toString()

            val text=inputText.editableText.toString()
            val intent=Intent(this,BirthdayCardActivity::class.java)
            intent.putExtra("inputText",text)
            startActivity(intent)


        }
    }

}