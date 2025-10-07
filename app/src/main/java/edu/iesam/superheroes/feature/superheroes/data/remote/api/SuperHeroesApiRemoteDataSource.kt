package edu.iesam.superheroes.feature.superheroes.data.remote.api

import edu.iesam.superheroes.core.api.ApiClient
import edu.iesam.superheroes.feature.superheroes.domain.ErrorApp
import edu.iesam.superheroes.feature.superheroes.domain.SuperHero

class SuperHeroesApiRemoteDataSource (private val apiClient: ApiClient) {

    fun getSuperHeroes(): Result<List<SuperHero>> {
        //entran ApiModel
        //salen Models
        val apiService = apiClient.createService(SuperHeroApiService::class.java)
        apiService.findAll()

        return Result.success(listOf())
    }
}