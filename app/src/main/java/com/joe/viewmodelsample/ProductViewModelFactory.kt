package com.joe.viewmodelsample

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

/**
 * author: Joe Cheng
 */
//繼承ViewModelProvider.NewInstanceFactory()協助建立ViewModel，可以丟入參數
class ProductViewModelFactory(private val defaultNumber : Int): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ProductViewModel2(defaultNumber) as T
    }
}