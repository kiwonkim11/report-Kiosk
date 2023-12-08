package com.example.kiosk

open class Drink() {
    open var name: String = ""
    open var price: Int = 0
    fun displayInfo() {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class Coke () : Drink() {
    override var name="콜라"
    override var price=2000
}

class Sprite () : Drink() {
    override var name="스프라이트"
    override var price=2000
}

class Juice () : Drink() {
    override var name="오렌지쥬스"
    override var price=2800
}

class Coffee () : Drink() {
    override var name="아메리카노"
    override var price=1500
}