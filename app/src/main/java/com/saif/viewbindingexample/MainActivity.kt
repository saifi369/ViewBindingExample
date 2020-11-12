package com.saif.viewbindingexample

import android.os.Bundle
import android.widget.Toast




import androidx.appcompat.app.AppCompatActivity
import com.saif.viewbindingexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            tvOutput1.text = "Hello World!"
            tvOutput2.text = "Welcome to View Binding"

            btnClickMe.setOnClickListener {
                Toast.makeText(this@MainActivity, "Hello World", Toast.LENGTH_SHORT).show()
            }
        }
    }
}