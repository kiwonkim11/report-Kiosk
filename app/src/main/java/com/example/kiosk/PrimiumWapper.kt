package com.example.kiosk

open class PrimiumWapper() {
    open var name: String = ""
    open var price: Int = 0
    fun displayInfo() {
        println ("${name} 주문하였습니다. 이 제품의 가격은 ${price} 원 입니다.")
    }
}

class QuacheeWapper () : PrimiumWapper() {
    override var name="콰트로치즈와퍼"
    override var price=7900
}

class ShrimpWapper () : PrimiumWapper() {
    override var name="통새우와퍼"
    override var price=7900
}

class MonsterWapper () : PrimiumWapper() {
    override var name="몬스터와퍼"
    override var price=9300
}

class StackerWapper () : PrimiumWapper() {
    override var name="스태커4 와퍼"
    override var price=13000
}