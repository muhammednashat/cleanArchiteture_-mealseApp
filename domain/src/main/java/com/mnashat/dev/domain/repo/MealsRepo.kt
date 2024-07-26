package com.mnashat.dev.domain.repo

import com.mnashat.dev.domain.entity.CategoriesResponse

interface MealsRepo {
    fun getMealsFromRemote():CategoriesResponse
}