package com.example.kiosk

open class Wapper () {
    fun displayInfo(name: String, price: Int) {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class WapperBurger (name: String, price: Int) : Wapper() {

}

class CheeseWapper (name: String, price: Int) : Wapper() {

}

class BulgogiWapper (name: String, price: Int) : Wapper() {

}

class WapperJunior (name: String, price: Int) : Wapper() {

}