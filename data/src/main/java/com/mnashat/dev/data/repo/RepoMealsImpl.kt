package com.mnashat.dev.data.repo

import com.mnashat.dev.data.remote.ApiService
import com.mnashat.dev.domain.entity.CategoriesResponse
import com.mnashat.dev.domain.repo.MealsRepo

class RepoMealsImpl(private val apiService: ApiService):MealsRepo {
    override suspend fun getMeals(): CategoriesResponse {
        return apiService.getMeals()
    }
}