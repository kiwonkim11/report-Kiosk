package com.example.kiosk

fun main() {
    println ("어서오세요 고객님.")
    println ("아래의 메뉴 중에서 원하는 것을 고르세요.")
    println ("")

    var menu = List()

    menu.menuList()

    while (true) {
        var selectNumber = readLine()?.toInt() ?: 0

        when (selectNumber) {
            1 -> primiumWapper(menu)
            2 -> wapper(menu)
            3 -> sideMenu(menu)
            4 -> drink(menu)
            9 -> pay(menu)
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }

    println ("프로그램을 종료합니다.")
}


fun primiumWapper(menu: List) {
    menu.primiumList()

    val myMenu = PrimiumWapper()
    val selectMenu = readLine()!!.toInt()

    when(selectMenu){
        1 -> myMenu.displayInfo("콰트로치즈와퍼", 7900)
        2 -> myMenu.displayInfo("통새우와퍼", 7900)
        3 -> myMenu.displayInfo("몬스터와퍼", 9300)
        4 -> myMenu.displayInfo("스태커4 와퍼", 13300)
        0 -> menu.menuList()
        else -> println("유효하지 않은 번호입니다.")
    }
}

fun wapper(menu: List) {

    menu.wapperList()

    val myMenu = Wapper()
    val selectMenu = readLine()!!.toInt()

    when(selectMenu){
        1 -> myMenu.displayInfo("와퍼", 7100)
        2 -> myMenu.displayInfo("치즈와퍼", 7700)
        3 -> myMenu.displayInfo("불고기와퍼", 7400)
        4 -> myMenu.displayInfo("와퍼주니어", 4700)
        0 -> menu.menuList()
        else -> println("유효하지 않은 번호입니다.")
    }
}

fun sideMenu(menu: List) {

    menu.sideList()

    val myMenu = SideMenu()
    val selectMenu = readLine()!!.toInt()

    when(selectMenu){
        1 -> myMenu.displayInfo("감자튀김", 2100)
        2 -> myMenu.displayInfo("너겟킹", 2200)
        3 -> myMenu.displayInfo("코울슬로", 2100)
        4 -> myMenu.displayInfo("바삭킹", 3000)
        0 -> menu.menuList()
        else -> println("유효하지 않은 번호입니다.")
    }
}

fun drink(menu: List) {

    menu.drinkList()

    val myMenu = Drink()
    val selectMenu = readLine()!!.toInt()

    when(selectMenu){
        1 -> myMenu.displayInfo("콜라", 2000)
        2 -> myMenu.displayInfo("스프라이트", 2000)
        3 -> myMenu.displayInfo("오렌지쥬스", 2800)
        4 -> myMenu.displayInfo("아메리카노", 1500)
        0 -> menu.menuList()
        else -> println("유효하지 않은 번호입니다.")
    }
}

fun pay(menu: List) {
    println ("결제수단을 선택하세요.")
    println ("1. 현금")
    println ("2. 카드")
    println ("0. 뒤로 가기")

    val selectMenu = readLine()!!.toInt()

    if (selectMenu == 0) menu.menuList()
}