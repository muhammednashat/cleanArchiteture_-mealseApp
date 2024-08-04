package com.mnashat.dev.cleanarchitecture_mealsapp

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mnashat.dev.domain.entity.CategoriesResponse
import com.mnashat.dev.domain.usecase.GetMeals
import dagger.hilt.android.lifecycle.HiltViewModel

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

import javax.inject.Inject
@HiltViewModel
class MealsViewModel @Inject constructor(private val useCase: GetMeals) : ViewModel() {

    private val _categories :MutableStateFlow<CategoriesResponse?> = MutableStateFlow(null)
     val categories:StateFlow<CategoriesResponse?>
         get() = _categories

    fun getCategories(){
        viewModelScope.launch{
            try {
                _categories.emit( useCase())
            }catch (e:Exception){
                Log.e("ViewModel"," Can not get MEALS because -> ${e.message.toString()}")
            }
        }
    }

}