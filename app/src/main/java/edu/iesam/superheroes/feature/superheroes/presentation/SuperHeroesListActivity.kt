package edu.iesam.superheroes.feature.superheroes.presentation

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import edu.iesam.superheroes.R
import edu.iesam.superheroes.core.api.ApiClient
import edu.iesam.superheroes.feature.superheroes.data.SuperHeroesDataRepository
import edu.iesam.superheroes.feature.superheroes.data.remote.api.SuperHeroesApiRemoteDataSource
import edu.iesam.superheroes.feature.superheroes.domain.GetSuperHeroesUseCase
import edu.iesam.superheroes.feature.superheroes.domain.SuperHeroeRepository
import kotlinx.coroutines.GlobalScope
import kotlin.concurrent.thread

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
        loadSuperHeroes()
    }
    private fun loadSuperHeroes() {
        val api = SuperHeroesApiRemoteDataSource(ApiClient())


        /*val dataRepository = SuperHeroesDataRepository(api)
        val getUseCase = GetSuperHeroesUseCase(dataRepository)

        val viewModel = SuperHeroesListViewModel(getUseCase)

        val result = viewModel.getClicked()

        result.fold(
            onSuccess = { listSuperHeroes ->
                listSuperHeroes.forEach { hero ->
                    Log.d("@dev", "Heroe: ${hero.id} - ${hero.name} - ${hero.slug} - ${hero.urlImage}")
                }
            },
            onFailure = { error ->
                Log.d("@dev", "Fallo de internet", error)

            }
        )

         */
    }
}