package co.rotaru.habittracker

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.time.Instant
import java.time.format.DateTimeFormatter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionButton: Button = findViewById(R.id.button)
        val habitTitle: TextView = findViewById(R.id.textView)
        actionButton.setOnClickListener {
            val toast = Toast.makeText(this, "Awesome 👍", Toast.LENGTH_SHORT)
            toast.show()
            val timestamp: String = DateTimeFormatter.ISO_INSTANT.format(Instant.now())
            habitTitle.text = timestamp
        }
    }
}