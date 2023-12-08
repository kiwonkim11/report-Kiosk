package com.example.kiosk

open class SideMenu() {
    open var name: String = ""
    open var price: Int = 0
    fun displayInfo() {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class FrenchFried () : SideMenu() {
    override var name="감자튀김"
    override var price=2100
}
class Coleslaw () : SideMenu() {
    override var name="코올슬로"
    override var price=2100
}

class NuggetKing () : SideMenu() {
    override var name="너겟킹"
    override var price=2200
}

class BasackKing () : SideMenu() {
    override var name="바삭킹"
    override var price=3000
}