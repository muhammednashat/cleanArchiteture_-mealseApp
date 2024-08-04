package com.mnashat.dev.data.repo

import com.mnashat.dev.data.remote.ApiService
import com.mnashat.dev.domain.entity.CategoriesResponse
import com.mnashat.dev.domain.repo.MealsRepo
import java.security.KeyStore.PrivateKeyEntry

class RepoImpl (private val apiService: ApiService):MealsRepo{
    override suspend fun getMealsFromRemote(): CategoriesResponse {
         return apiService.getMeals()
    }

}