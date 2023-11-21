package org.iesch.ejercicios1evmoviles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.iesch.ejercicios1evmoviles.databinding.ActivityMainBinding
import org.iesch.ejercicios1evmoviles.ejercicios.CalculadoraActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rellayCalculadora.setOnClickListener {
            intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }
        binding.rellaySuperheroes.setOnClickListener {
            intent = Intent(this, SuperHeroesActivity::class.java)
            startActivity(intent)
        }
        binding.rellayEdadCanina.setOnClickListener {
            intent = Intent(this, EdadCaninaActivity::class.java)
            startActivity(intent)
        }
        binding.rellayQuizzes.setOnClickListener {
            intent = Intent(this, QuizzesActivity::class.java)
            startActivity(intent)
        }
        binding.rellayGaleria.setOnClickListener {
            intent = Intent(this, GaleriaActivity::class.java)
            startActivity(intent)
        }
        binding.rellayMapas.setOnClickListener {
            intent = Intent(this, MapasActivity::class.java)
            startActivity(intent)
        }
        binding.rellayRestaurantes.setOnClickListener {
            intent = Intent(this, RestaurantesActivity::class.java)
            startActivity(intent)
        }
        binding.rellaySettings.setOnClickListener {
            intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}