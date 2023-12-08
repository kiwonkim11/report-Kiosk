package com.example.kiosk

fun main() {
    println ("어서오세요 고객님.")
    println ("아래의 메뉴 중에서 원하는 것을 고르세요.")
    println ("")

    val menu = List()
    var selectNumber: Int

    while (true) {
        menu.menuList()
        selectNumber = readLine()?.toInt() ?: 0

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
    val myMenu :ArrayList<PrimiumWapper> = arrayListOf(QuacheeWapper(), ShrimpWapper(), MonsterWapper(), StackerWapper())
    var selectMenu: Int

    while (true) {
        menu.primiumList()
        selectMenu = readLine()?.toInt() ?: 0

        when (selectMenu) {
            in 1..4 -> myMenu[selectMenu-1]
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}

fun wapper(menu: List) {
    val myMenu :ArrayList<Wapper> = arrayListOf(WapperBurger(), CheeseWapper(), BulgogiWapper(), WapperJunior())
    var selectMenu: Int

    while (true) {
        menu.primiumList()
        selectMenu = readLine()?.toInt() ?: 0

        when (selectMenu) {
            in 1..4 -> myMenu[selectMenu-1]
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}

fun sideMenu(menu: List) {
    val myMenu :ArrayList<SideMenu> = arrayListOf(FrenchFried(), NuggetKing(), Coleslaw(), BasackKing())
    var selectMenu: Int

    while (true) {
        menu.primiumList()
        selectMenu = readLine()?.toInt() ?: 0

        when (selectMenu) {
            in 1..4 -> myMenu[selectMenu-1]
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}

fun drink(menu: List) {
    val myMenu :ArrayList<Drink> = arrayListOf(Coke(), Sprite(), Juice(), Coffee())
    var selectMenu: Int

    while (true) {
        menu.primiumList()
        selectMenu = readLine()?.toInt() ?: 0

        when (selectMenu) {
            in 1..4 -> myMenu[selectMenu-1]
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
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