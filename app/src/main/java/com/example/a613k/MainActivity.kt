package com.example.a613k

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    lateinit var cardView: CardView
    lateinit var progressBar: ProgressBar
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {

        cardView = findViewById(R.id.cardView_id)
        progressBar = findViewById(R.id.progress_id)
        textView = findViewById(R.id.text_id)



        cardView.setOnClickListener {
            textView.text = "Please wait..."
            progressBar.visibility = View.VISIBLE


            Handler().postDelayed({
                textView.text = "Done"
                progressBar.visibility = View.GONE
                cardView.setCardBackgroundColor(Color.GREEN)

            }, 3000)

        }


    }
}