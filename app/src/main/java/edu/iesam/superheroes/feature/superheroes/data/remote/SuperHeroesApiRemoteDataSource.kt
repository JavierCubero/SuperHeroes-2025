package edu.iesam.superheroes.feature.superheroes.data.remote

import edu.iesam.superheroes.feature.superheroes.domain.ErrorApp
import edu.iesam.superheroes.feature.superheroes.domain.SuperHero

class SuperHeroesApiRemoteDataSource {

    fun getSuperHeroes(): Result<List<SuperHero>> {
        val Internet = true
        if (Internet) {
            return Result.success(listOf(SuperHero("1", "pepe", "bla", "jpg")))
        } else {
            return Result.failure(ErrorApp.InternetError)
        }
    }
}