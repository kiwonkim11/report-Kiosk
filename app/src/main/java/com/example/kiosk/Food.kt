package com.example.kiosk

class Food (name: String, price: Int, category: String) : Menu(name) {
    var price: Int
    var category: String

    init {
        this.price = price
        this.category = category
    }

    override fun displayInfo() {
        println ("ID: $idx, 이름: $name, 가격: $price, 카테고리: $category ")
    }
}