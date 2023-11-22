package org.iesch.ejercicios1evmoviles.ejercicios.superheroes


import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.iesch.ejercicios1evmoviles.databinding.ActivitySuperheroesDetailBinding
import org.iesch.ejercicios1evmoviles.ejercicios.superheroes.model.Hero


class SuperheroesDetailActivity : AppCompatActivity() {
    companion object{
        const val HERO_KEY = "superhero_name"
        const val IMAGE_PATH_KEY = "bitmap_key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivitySuperheroesDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras:Bundle = intent.extras!!
        val superHero = extras.getParcelable<Hero>(HERO_KEY)!!
        val imagePath = extras.getString(IMAGE_PATH_KEY)
        val bitmap = BitmapFactory.decodeFile(imagePath)

        if (bitmap != null) {
            binding.imageView.setImageBitmap(bitmap)
        }
        binding.superHero = superHero

    }
}