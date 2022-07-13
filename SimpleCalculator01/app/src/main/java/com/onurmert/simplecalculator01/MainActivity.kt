package com.onurmert.simplecalculator01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.onurmert.simplecalculator01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar

        if (actionBar != null){
            actionBar.hide()
        }
    }

    override fun onResume() {
        super.onResume()
        calculation()
    }

    private fun calculation(){
        binding.sumButton.setOnClickListener {
            sum()
        }
        binding.divisionButton.setOnClickListener {
            division()
        }
        binding.extractionButton.setOnClickListener {
            extraction()
        }
        binding.multiplationButton.setOnClickListener {
            multiplication()
        }
    }
    private fun getNumber1() : Double?{
        return binding.number1Edit.text.toString().trim().toDoubleOrNull()
    }

    private fun getNumber2() : Double?{
        return binding.number2Edit.text.toString().trim().toDoubleOrNull()
    }
    private fun sum(){
        val number1 = getNumber1()
        val number2 = getNumber2()

        if (number1 != null && number2 != null){
            val result = number1 + number2
            binding.resultText.text = result.toString()
            binding.number1Edit.setText("")
            binding.number2Edit.setText("")
        }else{
            Toast.makeText(this,"Boş yerleri doldurun", Toast.LENGTH_SHORT).show()
        }
    }
    private fun extraction(){
        val number1 = getNumber1()
        val number2 = getNumber2()

        if (number1 != null && number2 != null){
            val result = number1 - number2
            binding.resultText.text = result.toString()
            binding.number1Edit.setText("")
            binding.number2Edit.setText("")
        }else{
            Toast.makeText(this,"Boş yerleri doldurun", Toast.LENGTH_SHORT).show()
        }
    }
    private fun division(){
        val number1 = getNumber1()
        val number2 = getNumber2()

        if (number1 != null && number2 != null){
            val result = number1 / number2
            binding.resultText.text = result.toString()
            binding.number1Edit.setText("")
            binding.number2Edit.setText("")
        }else{
            Toast.makeText(this,"Boş yerleri doldurun", Toast.LENGTH_SHORT).show()
        }
    }
    private fun multiplication(){
        val number1 = getNumber1()
        val number2 = getNumber2()

        if (number1 != null && number2 != null){
            val result = number1 * number2
            binding.resultText.text = result.toString()
            binding.number1Edit.setText("")
            binding.number2Edit.setText("")
        }else{
            Toast.makeText(this,"Boş yerleri doldurun", Toast.LENGTH_SHORT).show()
        }
    }
}
