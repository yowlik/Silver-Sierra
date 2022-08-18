package us.nobarriers.els.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import us.nobarriers.els.R

class Res : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_res)
        val score=findViewById<TextView>(R.id.savet)
        val start=findViewById<ImageView>(R.id.start)
        val loser=findViewById<TextView>(R.id.saver)
        loser.text=getIntent().getStringExtra("lose")
        score.text=getIntent().getStringExtra("key")
        start.setOnClickListener {
            val intent= Intent(this@Res,Game::class.java)
            startActivity(intent)
        }
    }
}