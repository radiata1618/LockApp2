package com.app.lockapp2.framework.app.di

import LockTimeDao
import LockTimeDatabase
import android.app.Application
import android.content.Context
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.InternalCoroutinesApi
import javax.inject.Singleton

@ExperimentalFoundationApi
//@ExperimentalMaterialApi
@ExperimentalComposeUiApi
@InternalCoroutinesApi
@ExperimentalAnimationApi
//@ExperimentalMaterialNavigationApi
@Module
@InstallIn(SingletonComponent::class)
object AppModule {
//★AppModuleが不使用となっている★

    @Provides
    @Singleton
    fun provideLockTimeDatabase(
        app: Application
    ): LockTimeDatabase {
        return Room.databaseBuilder(
            app,
            LockTimeDatabase::class.java,
            "mainDatabase"
        ).build()
    }

    @Provides
    @Singleton
    fun provideLockTimeDao(database: LockTimeDatabase): LockTimeDao {
        return database.lockTimeDatabaseDao
    }

//    @Provides
//    @Singleton
//    fun provideLockTimeDao(app: Application): LockTimeDao {
//        return Room.databaseBuilder(
//            app,
//            LockTimeDatabase::class.java,
//            "mainDatabase"
//        ).build().lockTimeDatabaseDao
//    }
}