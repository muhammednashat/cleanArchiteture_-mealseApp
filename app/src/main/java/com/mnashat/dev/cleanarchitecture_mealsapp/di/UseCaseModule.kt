package com.mnashat.dev.cleanarchitecture_mealsapp.di

import com.mnashat.dev.domain.repo.MealsRepo
import com.mnashat.dev.domain.usecase.GetMeals
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideGetMealsUseCase(mealsRepo: MealsRepo):GetMeals{
      return  GetMeals(mealsRepo)
    }
}