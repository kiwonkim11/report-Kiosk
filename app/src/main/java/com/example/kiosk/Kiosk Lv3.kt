package com.example.kiosk

fun main() {
    println ("어서오세요 고객님.")
    println ("아래의 메뉴 중에서 원하는 것을 고르세요.")
    println ("")

    var menu = List()

    menu.menuList()

    while (true) {
        var name: String = ""
        var price: Int = 0
        var selectNumber = readLine()!!.toInt()

        when (selectNumber) {
            1 -> primiumWapper(menu, name, price)
            2 -> wapper(menu, name, price)
            3 -> sideMenu(menu, name, price)
            4 -> drink(menu, name, price)
            9 -> pay(menu)
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }

    println ("프로그램을 종료합니다.")
}


fun primiumWapper(menu: List, name: String, price: Int) {
    menu.primiumList()

    val myMenu = PrimiumWapper(name, price)
    val selectMenu = readLine()!!.toInt()

    if (selectMenu == 0) menu.menuList()

    else if (selectMenu == 1) {
        myMenu.displayInfo("콰트로치즈와퍼", 7900)
    }
    else if (selectMenu == 2) {
        myMenu.displayInfo("통새우와퍼", 7900)
    }
    else if (selectMenu == 3) {
        myMenu.displayInfo("몬스터와퍼", 9300)
    }
    else if (selectMenu == 4) {
        myMenu.displayInfo("스태커4 와퍼", 13300)
    }
}

fun wapper(menu: List, name: String, price: Int) {

    menu.wapperList()

    val myMenu = Wapper(name, price)
    val selectMenu = readLine()!!.toInt()

    if (selectMenu == 0) menu.menuList()
    else if (selectMenu == 1) {
        myMenu.displayInfo("와퍼", 7100)
    }
    else if (selectMenu == 2) {
        myMenu.displayInfo("치즈와퍼", 7700)
    }
    else if (selectMenu == 3) {
        myMenu.displayInfo("불고기와퍼", 7400)
    }
    else if (selectMenu == 4) {
        myMenu.displayInfo("와퍼주니어", 4700)
    }
}

fun sideMenu(menu: List, name: String, price: Int) {

    menu.sideList()

    val myMenu = SideMenu(name, price)
    val selectMenu = readLine()!!.toInt()

    if (selectMenu == 0) menu.menuList()
    else if (selectMenu == 1) {
        myMenu.displayInfo("감자튀김", 2100)
    } else if (selectMenu == 2) {
        myMenu.displayInfo("너겟킹", 2200)
    } else if (selectMenu == 3) {
        myMenu.displayInfo("코울슬로", 2100)
    } else if (selectMenu == 4) {
        myMenu.displayInfo("바삭킹", 3000)
    }
}

fun drink(menu: List, name: String, price: Int) {

    menu.drinkList()

    val myMenu = Drink(name, price)
    val selectMenu = readLine()!!.toInt()

    if (selectMenu == 0) menu.menuList()
    else if (selectMenu == 1) {
        myMenu.displayInfo("콜라", 2000)
    }
    else if (selectMenu == 2) {
        myMenu.displayInfo("스프라이트", 2000)
    }
    else if (selectMenu == 3) {
        myMenu.displayInfo("오렌지쥬스", 2800)
    }
    else if (selectMenu == 4) {
        myMenu.displayInfo("아메리카노", 1500)
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