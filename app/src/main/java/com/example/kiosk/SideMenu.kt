package com.example.kiosk

open class SideMenu (name: String, price: Int) {
    fun displayInfo(name: String, price: Int) {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class FrenchFried (name: String, price: Int) : SideMenu(name, price) {

}
class coleslaw (name: String, price: Int) : SideMenu(name, price) {

}

class NuggetKing (name: String, price: Int) : SideMenu(name, price) {

}

class BasackKing (name: String, price: Int) : SideMenu(name, price) {

}