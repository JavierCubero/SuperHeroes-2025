package edu.iesam.superheroes.feature.superheroes.data.remote

import edu.iesam.superheroes.feature.superheroes.domain.SuperHeroe

class SuperHeroesApiRemoteDataSource {

    fun getSuperHeroes(): Result<List<SuperHeroe>> {
        return Result.success(listOf(SuperHeroe("","","","")))
    }
}