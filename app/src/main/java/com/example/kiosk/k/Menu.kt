package com.example.kotlinetest.Kiosk

open class Menu () {
    open fun menuDetail(menu: String) {
        var menuIng = arrayOf("재료") /*Ingredient(menu)*/
        var menuPrc = 3000 /*Price(menu)*/
        println("${menu} |")
        println("${menu}의 재료는 ${menuIng}")
        println("${menu}의 가격은 ${menuPrc}")

    }
    open fun orderMenu(menu: String) {
        println("${menu}의 수량을 선택")
        var menuAmt = readLine()!!.toInt()
        println("${menu}을 ${menuAmt}개 선택하였습니다")
    }
}