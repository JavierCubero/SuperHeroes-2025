package edu.iesam.superheroes.feature.superheroes.domain

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import junit.framework.TestCase.assertTrue
import org.junit.Test
import kotlin.test.assertEquals

class GetSuperHeroesUseCaseTest {

    @Test
    fun `when getClicked returns list of superheores`(){

        val superHeroeRepositoryMock = mockk<SuperHeroeRepository>()
        val getSuperHeroesUseCase = GetSuperHeroesUseCase(superHeroeRepositoryMock)
        val superHeroList = listOf(
            SuperHero("1", "John", "Homelander", "homelander.jpg"),
            SuperHero("2", "Maggie", "Queen Maeve", "queenmaeve.jpg"),
            SuperHero("3", "Kevin", "The Deep", "thedeep.jpg")
        )
        every { superHeroeRepositoryMock.getSuperHeroes()} returns Result.success(superHeroList)
        val result = getSuperHeroesUseCase.invoke()

        assertTrue(result.isSuccess)
        assertEquals(superHeroList, result.getOrThrow())

        verify(exactly = 1) {superHeroeRepositoryMock.getSuperHeroes() }
    }

    @Test
    fun `when getClicked returns internet error`() {

        val superHeroeRepositoryMock = mockk<SuperHeroeRepository>()
        val getSuperHeroesUseCase = GetSuperHeroesUseCase(superHeroeRepositoryMock)
        every { superHeroeRepositoryMock.getSuperHeroes()} returns Result.failure(ErrorApp.InternetError)
        val result = getSuperHeroesUseCase.invoke()

        assertTrue(result.isFailure)
        assertEquals(ErrorApp.InternetError, result.exceptionOrNull())

        verify(exactly = 1) {superHeroeRepositoryMock.getSuperHeroes() }
    }
}