package com.example.kiosk

class PrimiumWapper (name: String, price: Int) {

    fun displayInfo(name: String, price: Int) {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}