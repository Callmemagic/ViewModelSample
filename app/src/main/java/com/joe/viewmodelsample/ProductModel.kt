package com.joe.viewmodelsample

class ProductModel(
    var name: String,
    var desc: String,
    var price: Int,
    var number: Int = 0
) {

    fun add() {
        number++
        println("number:$number")
    }

    fun minus() {
        number--
        println("number:$number")
    }
}

