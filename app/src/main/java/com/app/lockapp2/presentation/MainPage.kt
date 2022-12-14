package com.app.lockapp2.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController

//https://blog.mokelab.com/
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(
    viewModel: LockTimeViewModel,
    navController: NavController) {


    Scaffold(floatingActionButton = {  }) {
        Text(text=viewModel.lockTimes.collectAsState(emptyList()).value.size.toString()+"データ")

    }
}