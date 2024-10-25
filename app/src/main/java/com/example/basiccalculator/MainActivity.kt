package com.example.basiccalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener{

    lateinit var edit_text_1 : EditText
    lateinit var edit_text_2 : EditText
    lateinit var btn_add : Button
    lateinit var btn_sub: Button
    lateinit var btn_mul: Button
    lateinit var btn_div: Button
    lateinit var result_TV : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edit_text_1 = findViewById(R.id.edit1)
        edit_text_2 = findViewById(R.id.edit2)
        btn_add = findViewById(R.id.btn_add)
        btn_sub = findViewById(R.id.btn_sub)
        btn_mul = findViewById(R.id.btn_mul)
        btn_div = findViewById(R.id.btn_div)
        result_TV = findViewById(R.id.result)

        btn_add.setOnClickListener(this)
        btn_sub.setOnClickListener(this)
        btn_mul.setOnClickListener(this)
        btn_div.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        var ed_1 = edit_text_1.text.toString().toDouble()
        var ed_2 = edit_text_2.text.toString().toDouble()
        var result = 0.0
        when(v?.id){
            R.id.btn_add -> {
                result = ed_1 + ed_2
            }
            R.id.btn_sub -> {
                result = ed_1 - ed_2
            }
            R.id.btn_mul -> {
                result = ed_1 * ed_2
            }
            R.id.btn_div -> {
                if (ed_2 != 0.0){
                    result = ed_1 / ed_2
                }
            }
        }

        result_TV.text = "Result is $result"
    }
}
