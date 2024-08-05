package com.mnashat.dev.cleanarchitecture_mealsapp

import androidx.lifecycle.ViewModel
import com.mnashat.dev.domain.usecase.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MealsViewModel @Inject constructor
    (private val useCaseGetMeals: GetMeals) : ViewModel() {
}