package com.example.kiosk

class Order() {

    open fun orderMenu(menu: String): Int {
        println("${menu}의 수량을 선택")
        var menuAmt = readLine()!!.toInt()
        println("${menu}을 ${menuAmt}개 선택하였습니다")

        return MenuPrice().price(menu)!!.toInt()
    }

}