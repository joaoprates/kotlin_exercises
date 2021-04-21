package com.example.calcnote

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcule = calcule
        val result = result

        btCalcule.setOnClickListener {
            val note1 = Integer.parseInt(note1.text.toString())
            val note2 = Integer.parseInt(note2.text.toString())
            val media = (note1 + note2) / 2
            val fault = Integer.parseInt(fault.text.toString())

            if(media >=6 && media <= 10){
                result.setText("Aluno foi aprovado" + "\n" + "Final note: " + media + "\n"
                        + "Faults: "  + fault)
                result.setTextColor(Color.GREEN)
            } else {
                result.setText("Aluno foi Reprovado" + "\n" + "Final note: " + media + "\n"
                        + "Faults: " + fault)
                result.setTextColor(Color.RED)

            }
        }
    }
}