package edu.iesam.superheroes.feature.superheroes.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superheroes.R
import edu.iesam.superheroes.feature.superheroes.data.SuperHeroesDataRepository
import edu.iesam.superheroes.feature.superheroes.data.remote.SuperHeroesApiRemoteDataSource
import edu.iesam.superheroes.feature.superheroes.domain.GetSuperHeroesUseCase
import edu.iesam.superheroes.feature.superheroes.domain.SuperHeroeRepository

class SuperHeroesListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun initSuperHeroes() {
        val api = SuperHeroesApiRemoteDataSource()
        val dataRepository = SuperHeroesDataRepository(api)
        val getUseCase = GetSuperHeroesUseCase(dataRepository)

        val viewModel = SuperHeroesListViewModel(getUseCase)

        viewModel.getClicked()
        Log.d("@dev", "Stop")
    }
}