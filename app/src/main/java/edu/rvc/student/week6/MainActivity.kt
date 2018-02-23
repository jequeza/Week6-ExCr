package edu.rvc.student.week6

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spin = findViewById<Spinner>(R.id.spinner)
        val txtAge = findViewById<EditText>(R.id.txtAge)
        val txtFN = findViewById<EditText>(R.id.txtFullName)
        val txtEM = findViewById<EditText>(R.id.txtEmail)
        val txtShow = findViewById<TextView>(R.id.txtShow)
        val btnSub = findViewById<Button>(R.id.btnSubmit)
        val list = arrayOf("Math", "English", "Science", "Programming")
        val adapter1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list)
        android.R.layout.simple_spinner_item
        android.R.layout.simple_spinner_dropdown_item
        spin.adapter = adapter1

        btnSub.setOnClickListener {
            when (spin.selectedItem.toString()) {
                "Math" -> txtShow.text = "Name: ${txtFN.text.toString()} Email: ${txtEM.text.toString()} Age: ${txtAge.text.toString()} What's your favorite subject of study at RVC? Math"
                "English" -> txtShow.text = "Name: ${txtFN.text.toString()} Email: ${txtEM.text.toString()} Age: ${txtAge.text.toString()} What's your favorite subject of study at RVC? English"
                "Science" -> txtShow.text = "Name: ${txtFN.text.toString()} Email: ${txtEM.text.toString()} Age: ${txtAge.text.toString()} What's your favorite subject of study at RVC? Science"
                "Programming" -> txtShow.text = "Name: ${txtFN.text.toString()} Email: ${txtEM.text.toString()} Age: ${txtAge.text.toString()} What's your favorite subject of study at RVC? Programming"
            }

            hideKeyboard()
        }
    }

    fun hideKeyboard() {
        try {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(currentFocus!!.windowToken, 0)
        } catch (e: Exception) {
            // TODO: handle exception
        }

    }
}
