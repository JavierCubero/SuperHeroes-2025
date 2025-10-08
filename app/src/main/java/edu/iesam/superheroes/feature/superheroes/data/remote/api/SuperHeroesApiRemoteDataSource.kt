package edu.iesam.superheroes.feature.superheroes.data.remote.api

import edu.iesam.superheroes.core.api.ApiClient
import edu.iesam.superheroes.feature.superheroes.domain.ErrorApp
import edu.iesam.superheroes.feature.superheroes.domain.SuperHero
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class SuperHeroesApiRemoteDataSource(private val apiClient: ApiClient) {

    suspend fun getSuperHeroes(): Result<List<SuperHero>> {
        //entran ApiModel
        //salen Models
        return withContext(Dispatchers.IO) {
            val apiService = apiClient.createService(SuperHeroApiService::class.java)
            val resultSuperHero = apiService.findAll()
            if (resultSuperHero.isSuccessful && resultSuperHero.errorBody() == null) {
                val listSuperHeroApiModel: List<SuperHeroApiModel> = resultSuperHero.body()!!
                val listSuperHero = listSuperHeroApiModel.map { superHeroApiModel ->
                    superHeroApiModel.toModel()
                }
                Result.success(listSuperHero)

                // manera rápida:
                // return Result.success(resultSuperHero.body()!!.map {
                //     it.toModel()
                // })
            } else {
                Result.failure(ErrorApp.InternetError)
            }
        }
    }
}