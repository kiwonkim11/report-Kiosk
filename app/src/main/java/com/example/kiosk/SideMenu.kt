package com.example.kiosk

//import com.example.kotlinetest.Kiosk.Menu

class SideMenu(): Menu() {
    override fun menuDetail(menu: String) {
        var menuIng = Ingredient().whatIng(menu)
        var menuPrc = 3000 /*MenuPrice(menu)*/
        println("${menu} |")
        println("${menu}의 재료는 ${menuIng}")
        println("${menu}의 가격은 ${menuPrc}")
    }
}