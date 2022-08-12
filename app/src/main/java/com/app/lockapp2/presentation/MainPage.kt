package com.app.lockapp2.presentation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(
    viewModel: LockTimeViewModel = hiltViewModel(),
    navController: NavController) {


    Scaffold(floatingActionButton = {  }) {

    }
}