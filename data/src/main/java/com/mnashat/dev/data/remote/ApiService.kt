package com.mnashat.dev.data.remote

import com.mnashat.dev.domain.entity.CategoriesResponse
import retrofit2.http.GET

interface  ApiService {
    @GET("categories.php")
    suspend  fun getMeals(): CategoriesResponse

}