package edu.iesam.superheroes.feature.superheroes.domain

interface SuperHeroeRepository {
    fun getSuperHeroes(): List<SuperHeroe>
}