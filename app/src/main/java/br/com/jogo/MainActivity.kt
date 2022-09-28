package br.com.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.jogo.play.HashActivity
import com.example.projeto_jogo.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnPlay = findViewById<Button>(R.id.btn_play);

    btnPlay.setOnClickListener()
    {
        startActivity(Intent( this@MainActivity, HashActivity:: class.java))
    }

    }
}