//package com.example.healthyfitness.presentation.utils
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import com.example.healthyfitness.data.data_source.repository.LoginRepository
//import com.example.healthyfitness.presentation.screens.viewmodels.LoginViewModel
//
//class LogInViewModelFactory(
//    private val repository: LoginRepository
//) : ViewModelProvider.Factory {
//    @Suppress("UNCHECKED_CAST")
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        // Check if the requested ViewModel class is LoginViewModel
//        if (modelClass.isAssignableFrom(LoginViewModel::class.java)) { // Change to LoginViewModel
//            return LoginViewModel(repository) as T
//        }
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//}