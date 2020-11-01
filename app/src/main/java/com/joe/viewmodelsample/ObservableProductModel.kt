package com.joe.viewmodelsample

import androidx.databinding.ObservableField

class ObservableProductModel(
    name: String,
    desc: String,
    price: Int,
    number: Int
) {
    var name: ObservableField<String> = ObservableField(name)
    var desc: ObservableField<String> = ObservableField(desc)
    var price: ObservableField<Int> = ObservableField(price)
    var number: ObservableField<Int> = ObservableField(number)

    fun add() {
        number.set((number.get() ?: 0) + 1)
    }

    fun minus() {
        number.set((number.get() ?: 0) - 1)
    }
}