package com.branden.myquiz_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.btn_start)
        val etName : EditText = findViewById(R.id.et_name)

        btnStart.setOnClickListener {
            if(etName.text.isEmpty()){
                Toast.makeText(this,
                    "Please enter your name",
                    Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                // intent 실행
                startActivity(intent)
                // 현재 MainActivity를 종료한다. 즉, 앱이 종료된다.
                finish()
            }
        }

    }
}