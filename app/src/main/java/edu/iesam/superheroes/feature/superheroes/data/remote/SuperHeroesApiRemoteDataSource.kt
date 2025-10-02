package edu.iesam.superheroes.feature.superheroes.data.remote

import edu.iesam.superheroes.feature.superheroes.domain.ErrorApp
import edu.iesam.superheroes.feature.superheroes.domain.SuperHeroe

class SuperHeroesApiRemoteDataSource {

    fun getSuperHeroes(): Result<List<SuperHeroe>> {
        val Internet = true
        if (Internet) {
            return Result.success(listOf(SuperHeroe("1", "pepe", "bla", "jpg")))
        } else {
            return Result.failure(ErrorApp.InternetError)
        }
    }
}