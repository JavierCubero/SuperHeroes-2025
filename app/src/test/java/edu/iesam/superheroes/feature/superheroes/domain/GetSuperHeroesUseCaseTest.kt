package edu.iesam.superheroes.feature.superheroes.domain

import io.mockk.every
import io.mockk.mockk
import org.junit.Test

class GetSuperHeroesUseCaseTest {

    @Test
    fun `when getClicked return list of superheores`(){

        val superHeroeRepositoryMock = mockk<SuperHeroeRepository>()
        val getSuperHeroesUseCase = GetSuperHeroesUseCase(superHeroeRepositoryMock)
        val superHeroList = listOf(
            SuperHero("1", "John", "Homelander", "homelander.jpg"),
            SuperHero("2", "Maggie", "Queen Maeve", "queenmaeve.jpg"),
            SuperHero("3", "Kevin", "The Deep", "thedeep.jpg")
        )
        every { }
    }
}