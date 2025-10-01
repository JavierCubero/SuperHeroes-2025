package edu.iesam.superheroes.feature.superheroes.domain

class GetSuperHeroesUseCase(val superHeroeRepository: SuperHeroeRepository) {
    operator fun invoke(): List<SuperHeroe> {
        return superHeroeRepository.getSuperHeroes()
    }
}