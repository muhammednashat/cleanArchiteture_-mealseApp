package com.mnashat.dev.cleanarchitecture_mealsapp.di

import com.mnashat.dev.data.remote.ApiService
import com.mnashat.dev.data.repo.RepoImpl
import com.mnashat.dev.domain.repo.MealsRepo
import com.mnashat.dev.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object RepoModule {


    @Provides
    fun provideRepoImpl( apiService: ApiService) = RepoImpl(apiService)

}