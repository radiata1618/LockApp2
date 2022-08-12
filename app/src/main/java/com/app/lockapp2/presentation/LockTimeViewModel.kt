package com.app.lockapp2.presentation

import LockTimeDao
import androidx.compose.runtime.Stable
import androidx.lifecycle.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@AndroidEntryPoint
@Stable
@HiltViewModel
class LockTimeViewModel @Inject constructor(
lockTimeDao: LockTimeDao
) : ViewModel(){

    var lockTimes = lockTimeDao.getAllFlow()

}