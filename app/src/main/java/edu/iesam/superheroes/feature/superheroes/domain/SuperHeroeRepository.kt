package edu.iesam.superheroes.feature.superheroes.domain

interface SuperHeroeRepository {
    suspend fun getSuperHeroes(): Result<List<SuperHero>>
}