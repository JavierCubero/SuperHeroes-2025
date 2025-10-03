package edu.iesam.superheroes.feature.superheroes.domain

class GetSuperHeroesUseCase(val superHeroeRepository: SuperHeroeRepository) {
    operator fun invoke() :Result<List<SuperHero>> {
        val superHero = superHeroeRepository.getSuperHeroes()
        return superHero
    }
}