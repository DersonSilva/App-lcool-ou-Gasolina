package com.anderson.dev.app.appacoolougasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.anderson.dev.app.appacoolougasolina.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        binding.buttonCalcular.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_calcular)
            buttonCalculadora()

    }

    private fun buttonCalculadora() {

            val alcool = binding.editAlcool.text.toString().toFloat()
            val gasolina = binding.editGasolina.text.toString().toFloat()

            val resultadoFinal = alcool / gasolina

            if (resultadoFinal >= 0.7) {
                binding.textResultado.text = "Melhor utilizar Gasolina!"
              } else {
                binding.textResultado.text = "Melhor utilizar Álcool!"
            }

        }

    }











