package com.example.kiosk

open class PrimiumWapper () {
    fun displayInfo(name: String, price: Int) {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class QuacheeWapper (name: String, price: Int) : PrimiumWapper() {

}

class ShrimpWapper (name: String, price: Int) : PrimiumWapper() {

}

class MonsterWapper (name: String, price: Int) : PrimiumWapper() {

}

class StackerWapper (name: String, price: Int) : PrimiumWapper() {

}