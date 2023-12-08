package com.example.kiosk

open class SideMenu() {
    fun displayInfo(name: String, price: Int) {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class FrenchFried (name: String, price: Int) : SideMenu() {

}
class Coleslaw (name: String, price: Int) : SideMenu() {

}

class NuggetKing (name: String, price: Int) : SideMenu() {

}

class BasackKing (name: String, price: Int) : SideMenu() {

}