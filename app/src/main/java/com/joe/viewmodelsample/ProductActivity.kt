package com.joe.viewmodelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.joe.viewmodelsample.databinding.ActivityProductBinding

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val binding =
            DataBindingUtil.setContentView<ActivityProductBinding>(this, R.layout.activity_product)

        //直接使用DataModel
//        val model = ProductModel("pixel3", "Google Pixel 3", 11000, 1)
//        binding.viewModel = model

        //改使用ObservableProductModel
//        val model = ObservableProductModel("pixel3", "Google Pixel 3", 13000, 1)


        //*****this-> 這個Viewmodel會跟隨此activity的生命週期*****
//        val model = ViewModelProvider(this).get(ProductViewModel::class.java)
//        val model = ViewModelProvider(this).get(ProductViewModel2::class.java)

        //用ViewModelFactory協助建立ViewModel
//        val model = ViewModelProvider(this, ProductViewModelFactory(3))
//            .get(ProductViewModel2::class.java)

        //可以用androidx.activity:activity-ktx協助用簡短的語法使用ViewModelFactory
        val model : ProductViewModel by viewModels() //無參數使用方法

        val model2 : ProductViewModel2 by viewModels { ProductViewModelFactory(3) } //有參數+Factory使用方法

        binding.viewModel = model2

    }
}