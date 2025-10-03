package edu.iesam.superheroes.feature.superheroes.data

import edu.iesam.superheroes.feature.superheroes.data.remote.SuperHeroesApiRemoteDataSource
import edu.iesam.superheroes.feature.superheroes.domain.SuperHero
import edu.iesam.superheroes.feature.superheroes.domain.SuperHeroeRepository

class SuperHeroesDataRepository(
    private val apiRemoteDataSource: SuperHeroesApiRemoteDataSource
) : SuperHeroeRepository {
    override fun getSuperHeroes(): Result<List<SuperHero>> {
        return apiRemoteDataSource.getSuperHeroes()
    }
}