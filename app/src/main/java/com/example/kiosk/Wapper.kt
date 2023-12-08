package com.example.kiosk

open class Wapper {
    open var name: String = ""
    open var price: Int = 0
    fun displayInfo() {
        println("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class WapperBurger : Wapper() {
    override var name = "와퍼"
    override var price = 7100
}

class CheeseWapper : Wapper() {
    override var name = "치즈와퍼"
    override var price = 7700
}

class BulgogiWapper : Wapper() {
    override var name = "불고기와퍼"
    override var price = 7400
}

class WapperJunior : Wapper() {
    override var name = "와퍼주니어"
    override var price = 4700
}