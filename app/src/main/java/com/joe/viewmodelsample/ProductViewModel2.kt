package com.joe.viewmodelsample

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.graphics.drawable.Drawable
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel

/**
 * author: Joe Cheng
 */

//繼承LifeCycle的ViewModel
//想塞入參數，用ViewModelFactory協助建立
class ProductViewModel2(private val defaultNumber: Int) : ViewModel() {
    var name: ObservableField<String> = ObservableField()
    var desc: ObservableField<String> = ObservableField()
    var price: ObservableField<Int> = ObservableField()
    var number: ObservableField<Int> = ObservableField()

    init {
        name.set("iPhone12 Pro")
        price.set(33000)
        desc.set("Apple iPhone12 Pro")
        number.set(defaultNumber)
    }
    fun add() {
        number.set((number.get() ?: 0) + 1)
        println("number: $number")
    }

    fun minus() {
        number.set((number.get() ?: 0) - 1)
        println("number: $number")
    }
}