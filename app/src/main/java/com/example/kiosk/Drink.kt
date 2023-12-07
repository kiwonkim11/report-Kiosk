package com.example.kiosk

open class Drink(name: String, price: Int) {
    fun displayInfo(name: String, price: Int) {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class Coke (name: String, price: Int) : Drink(name, price) {

}

class Sprite (name: String, price: Int) : Drink(name, price) {

}

class Juice (name: String, price: Int) : Drink(name, price) {

}

class Coffee (name: String, price: Int) : Drink(name, price) {

}