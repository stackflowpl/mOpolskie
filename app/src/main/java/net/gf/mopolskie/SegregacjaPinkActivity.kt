package net.gf.mopolskie

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.ComponentActivity

class SegregacjaPinkActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segregacja_pink)

        window.statusBarColor = resources.getColor(R.color.status_bar_color, theme)
        window.decorView.systemUiVisibility = 0

        val HelpButton = findViewById<LinearLayout>(R.id.help)
        HelpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val MainButton = findViewById<LinearLayout>(R.id.pulpit)
        MainButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val ServicesButton = findViewById<LinearLayout>(R.id.services)
        ServicesButton.setOnClickListener {
            val intent = Intent(this, ServicesActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val MoreButton = findViewById<LinearLayout>(R.id.more)
        MoreButton.setOnClickListener {
            val intent = Intent(this, MoreActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }

        val BackButton = findViewById<TextView>(R.id.back)
        BackButton.setOnClickListener {
            val intent = Intent(this, SegregacjaActivity::class.java)
            startActivity(intent)
            finish()
            overridePendingTransition(0, 0)
        }
    }
}
