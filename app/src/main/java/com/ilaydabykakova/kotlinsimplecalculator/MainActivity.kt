package com.ilaydabykakova.kotlinsimplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.ilaydabykakova.kotlinsimplecalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    var number1: Double? = null
    var number2: Double? = null
    var result: Double? = null

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

    }

    fun mySum(view : View){
        number1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (number1== null || number2 == null){
            binding.resultText.text = "Result: No numbers !"

        }else {
           result = number1!! + number2!!
           binding.resultText.text = "Result: ${result}"
        }

    }
    fun mySub(view : View){
        number1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (number1== null || number2 == null){
            binding.resultText.text = "Result: No numbers !"

        }else {
            result = number1!! - number2!!
            binding.resultText.text = "Result: ${result}"
        }

    }
    fun myMultiply(view : View){
        number1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (number1== null || number2 == null){
            binding.resultText.text = "Result: No numbers !"

        }else {
            result = number1!! * number2!!
            binding.resultText.text = "Result: ${result}"
        }


    }
    fun myDiv(view : View){
        number1 = binding.editTextNumber.text.toString().toDoubleOrNull()
        number2 = binding.editTextNumber2.text.toString().toDoubleOrNull()

        if (number1== null || number2 == null){
            binding.resultText.text = "Result: No numbers !"

        }else {
            result = number1!! / number2!!
            binding.resultText.text = "Result: ${result}"
        }


    }

}