package edu.iesam.superheroes.feature.superheroes.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import edu.iesam.superheroes.feature.superheroes.data.remote.api.SuperHeroesApiRemoteDataSource
import edu.iesam.superheroes.feature.superheroes.domain.GetSuperHeroesUseCase
import edu.iesam.superheroes.feature.superheroes.domain.SuperHero
import kotlinx.coroutines.launch

class SuperHeroesListViewModel(val dataSource: SuperHeroesApiRemoteDataSource) : ViewModel() {
    /*
        private val getSuperHeroesUseCase: GetSuperHeroesUseCase
        ) : ViewModel()
    {
        fun getClicked() : Result<List<SuperHero>> {
            return getSuperHeroesUseCase.invoke()
        }
     */
    fun loadSuperHeroes() {
        viewModelScope.launch {
            //Ejecuto el caso de uso
            val superHeroes = dataSource.getSuperHeroes()
            //UI
        }
    }
}