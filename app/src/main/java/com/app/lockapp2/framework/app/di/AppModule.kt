package com.app.lockapp2.framework.app.di

import AppDatabase
import LockTimeDao
import android.app.Application
import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    private fun provideDatabase(
        app: Application
    ): AppDatabase {
        return Room.databaseBuilder(
            app,
            AppDatabase::class.java,
            "mainDatabase"
        ).build()
    }

    @Provides
    @Singleton
    fun provideLockTimeDao(database: AppDatabase): LockTimeDao {
        return database.lockTimeDao()
    }
}