package com.example.midcalcintentweb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorAvtivity : AppCompatActivity() {
    lateinit var Tv_answer: TextView
    lateinit var Edt_Fnum: EditText
    lateinit var Edt_Fnum2: EditText
    lateinit var Buttonadd: Button
    lateinit var Buttonminus: Button
    lateinit var Buttonmultiply: Button
    lateinit var Buttondivide: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_avtivity)

        Tv_answer = findViewById(R.id.txt_answer)
        Edt_Fnum = findViewById(R.id.edt_Fnum)
        Edt_Fnum2 = findViewById(R.id.edt_Fnum2)
        Buttonadd = findViewById(R.id.btn_add)
        Buttonminus = findViewById(R.id.btn_minus)
        Buttonmultiply = findViewById(R.id.btn_multiply)
        Buttondivide = findViewById(R.id.btn_divide)

        Buttonadd.setOnClickListener {
            var myfirstnumber = Edt_Fnum.text.toString()
            var mysecondnumber = Edt_Fnum2.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() + mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        Buttonminus.setOnClickListener {
            var myfirstnumber = Edt_Fnum.text.toString()
            var mysecondnumber = Edt_Fnum2.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() - mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }

        }
        Buttonmultiply.setOnClickListener {
            var myfirstnumber = Edt_Fnum.text.toString()
            var mysecondnumber = Edt_Fnum2.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() * mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
        Buttondivide.setOnClickListener {
            var myfirstnumber = Edt_Fnum.text.toString()
            var mysecondnumber = Edt_Fnum2.text.toString()
            if (myfirstnumber.isEmpty() && mysecondnumber.isEmpty()) {
                Tv_answer.text = "please fill all the inputs"
            } else {
                var answer = myfirstnumber.toDouble() / mysecondnumber.toDouble()
                Tv_answer.text = answer.toString()
            }
        }
    }
}





