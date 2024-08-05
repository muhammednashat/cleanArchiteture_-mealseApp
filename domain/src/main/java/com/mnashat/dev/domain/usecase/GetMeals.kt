package com.mnashat.dev.domain.usecase

import com.mnashat.dev.domain.entity.CategoriesResponse
import com.mnashat.dev.domain.repo.MealsRepo

class GetMeals (private val mealsRepo: MealsRepo) {

suspend operator fun invoke():CategoriesResponse{
    return mealsRepo.getMeals()
}
}