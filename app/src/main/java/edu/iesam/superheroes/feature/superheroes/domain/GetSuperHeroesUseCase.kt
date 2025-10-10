package edu.iesam.superheroes.feature.superheroes.domain

class GetSuperHeroesUseCase(val superHeroeRepository: SuperHeroeRepository) {
    suspend operator fun invoke() :Result<List<SuperHero>> {
        val superHero = superHeroeRepository.getSuperHeroes()
        return superHero
    }
}