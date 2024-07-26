package com.example.englishwordsapp

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.isVisible
import com.example.englishwordsapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var binding: ActivityMainBinding

    private var _binding: ActivityMainBinding? = null
    private val binding
        get() = _binding ?: throw IllegalStateException("Binding for ActivityLearnWordBinding ust " +
                "not be null")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)

        enableEdgeToEdge()
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
//        val tvQuestionWord: TextView = findViewById(R.id.tvQuestionWord)
//        tvQuestionWord.text = "42"
//        tvQuestionWord.setTextColor(Color.BLUE)
//        tvQuestionWord.setTextColor(Color.parseColor("#FDD600"))
//        tvQuestionWord.setTextColor(ContextCompat.getColor(this, R.color.textVariantsColor))

//        binding.tvQuestionWord.text = "AndroidSprint.ru"
//        binding.tvQuestionWord.setTextColor(Color.GRAY)
//        binding.imageButton.isVisible = false

        with(binding) {
            tvQuestionWord.text = "AndroidSprint.ru"
            tvQuestionWord.setTextColor(Color.GRAY)
            imageButton.isVisible = false
        }
    }
}