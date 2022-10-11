package com.example.one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.View
import android.widget.Button
private const val TAG = "MainActivity"

class MainActivity() : AppCompatActivity(), Parcelable {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    private lateinit var nextButton: Button

    constructor(parcel: Parcel) : this() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "В лесу родилась Елочка")
        setContentView(R.layout.activity_main)

        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)
        nextButton = findViewById(R.id.next_button)

        trueButton.setOnClickListener { view: View ->
            checkAnswer(true)
        }
        
        falseButton.setOnClickListener { view: View ->
            checkAnswer(false)
        }
        nextButton.setOnClickListener {
            checkAnswer(true)
        }

    }
    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = 1
        override fun onStart() {
            super.onStart()
            Log.d(TAG, "В лесу она росла")
        }

        override fun onResume() {
            super.onResume()
            Log.d(TAG, "Зимой и летом стройная")
        }

        override fun onPause() {
            super.onPause()
            Log.d(TAG, "Зеленая была")
        }

        override  fun onStop() {
            super.onStop()
            Log.d(TAG, "Метель ей пела песенку")
        }

        override fun onDestroy() {
            super.onDestroy()
            Log.d(TAG, "Спи, Елочка, бай бай")
        }
    }

