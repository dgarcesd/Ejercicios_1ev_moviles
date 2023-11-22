package org.iesch.ejercicios1evmoviles.ejercicios.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.iesch.ejercicios1evmoviles.R
import org.iesch.ejercicios1evmoviles.databinding.ActivityCalculadoraBinding


class CalculadoraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityCalculadoraBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inicializamos los objetos donde sacaremos los datos
        val n1: EditText = binding.n1
        val n2: EditText = binding.n2
        val btnSuma: Button = binding.suma
        val btnResta: Button = binding.resta
        val btnMultiplicacion: Button = binding.multi
        val btnDivision: Button = binding.div
        val resultado: TextView = binding.resultado

        // Boton suma
        binding.suma.setOnClickListener {
            // Al hacer click queremos capturar el texto introducido
            var num1 = 0
            var num2 = 0
            try {
                val numero1 = n1.text.toString()
                if (numero1.isNotEmpty()) {
                    num1 = numero1.toInt()
                } else {
                    num1 = 0
                }
                val numero2 = n2.text.toString()
                if (numero2.isNotEmpty()) {
                    num2 = numero2.toInt()
                } else {
                    num2 = 0
                }

                val result = num1 + num2
                binding.resultado.text = result.toString()

            } catch (e: Exception) {
                Toast.makeText(this, getString(R.string.error), Toast.LENGTH_LONG).show()
            }
        }

        // Boton resta
        binding.resta.setOnClickListener {
            // Al hacer click queremos capturar el texto introducido
            var num1 = 0
            var num2 = 0
            try {
                val numero1 = n1.text.toString()
                if (numero1.isNotEmpty()) {
                    num1 = numero1.toInt()
                } else {
                    num1 = 0
                }
                val numero2 = n2.text.toString()
                if (numero2.isNotEmpty()) {
                    num2 = numero2.toInt()
                } else {
                    num2 = 0
                }

                val result = num1 - num2
                binding.resultado.text = result.toString()

            } catch (e: Exception) {
                Toast.makeText(this, getString(R.string.error), Toast.LENGTH_LONG).show()
            }
        }

        // Boton multiplicacion
        binding.multi.setOnClickListener {
            // Al hacer click queremos capturar el texto introducido
            var num1 = 0
            var num2 = 0
            try {
                val numero1 = n1.text.toString()
                if (numero1.isNotEmpty()) {
                    num1 = numero1.toInt()
                } else {
                    num1 = 0
                }
                val numero2 = n2.text.toString()
                if (numero2.isNotEmpty()) {
                    num2 = numero2.toInt()
                } else {
                    num2 = 0
                }

                val result = num1 * num2
                binding.resultado.text = result.toString()

            } catch (e: Exception) {
                Toast.makeText(this, getString(R.string.error), Toast.LENGTH_LONG).show()
            }
        }

        // Boton dividir
        binding.div.setOnClickListener {
            // Al hacer click queremos capturar el texto introducido
            var num1 = 0.0
            var num2 = 0.0
            try {
                val numero1 = n1.text.toString()
                if (numero1.isNotEmpty()) {
                    num1 = numero1.toDouble()
                } else {
                    num1 = 0.0
                }
                val numero2 = n2.text.toString()
                if (numero2.isNotEmpty()) {
                    num2 = numero2.toDouble()
                } else {
                    num2 = 0.0
                }

                val result = num1 / num2
                binding.resultado.text = result.toString()

            } catch (e: Exception) {
                Toast.makeText(this, getString(R.string.error), Toast.LENGTH_LONG).show()
            }
        }
    }
}