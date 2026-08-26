package com.shopmanager.v2

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 32, 32, 32)
        }

        val title = TextView(this).apply {
            text = "Shop Manager"
            textSize = 28f
        }

        val subtitle = TextView(this).apply {
            text = "Your shop, managed simply"
            textSize = 16f
        }

        val voiceEntry = Button(this).apply {
            text = "🎤 Voice Entry"
        }

        val stock = Button(this).apply {
            text = "📦 Stock & History"
        }

        val reports = Button(this).apply {
            text = "📊 Reports"
        }

        val lowStock = Button(this).apply {
            text = "⚠️ Low Stock"
        }

        val settings = Button(this).apply {
            text = "⚙️ Settings"
        }

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(voiceEntry)
        layout.addView(stock)
        layout.addView(reports)
        layout.addView(lowStock)
        layout.addView(settings)

        setContentView(layout)
    }
}
