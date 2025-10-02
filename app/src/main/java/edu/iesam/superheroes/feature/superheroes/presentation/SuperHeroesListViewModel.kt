package edu.iesam.superheroes.feature.superheroes.presentation

import androidx.lifecycle.ViewModel
import edu.iesam.superheroes.feature.superheroes.domain.GetSuperHeroesUseCase
import edu.iesam.superheroes.feature.superheroes.domain.SuperHeroe

class SuperHeroesListViewModel (
    private val getSuperHeroesUseCase: GetSuperHeroesUseCase
    ) : ViewModel()
{
    fun getClicked() : Result<List<SuperHeroe>> {
        return getSuperHeroesUseCase.invoke()
    }
}