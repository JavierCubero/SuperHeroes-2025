package edu.iesam.superheroes.feature.superheroes.domain

class GetSuperHeroesUseCase(val superHeroeRepository: SuperHeroeRepository) {
    operator fun invoke() :Result<List<SuperHeroe>> {
        val superHeroe = superHeroeRepository.getSuperHeroes()
        return superHeroe
    }
}