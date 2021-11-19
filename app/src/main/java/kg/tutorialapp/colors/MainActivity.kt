package kg.tutorialapp.colors

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener;
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ConstraintLayout: (ConstraintLayout) = findViewById(R.id.ConstraintLayout1)
        var redButton : (Button) = findViewById(R.id.button_red)
        var showTextView :(TextView) = findViewById(R.id.showColor)
        redButton.setOnClickListener(object : OnClickListener {
            override fun onClick(view: View?) {
                showTextView?.setText("КРАСНЫЙ")
                ConstraintLayout.setBackgroundColor(Color.RED)
            }
        })
        var yellowButton : (Button) = findViewById(R.id.button_yellow)
        yellowButton.setOnClickListener(object : OnClickListener {
            override fun onClick(view: View?) {
                showTextView?.setText("ЖЕЛТЫЙ")
                ConstraintLayout.setBackgroundColor(Color.YELLOW)
            }
        })
        var greenButton : (Button) = findViewById(R.id.button_green)
        greenButton.setOnClickListener(object : OnClickListener {
            override fun onClick(view: View?) {
                showTextView?.setText("ЗЕЛЕНЫЙ")
                ConstraintLayout.setBackgroundColor(Color.GREEN)
            }
        })
    }
}