package com.example.kiosk

fun main() {
    println ("어서오세요 고객님.")
    println ("아래의 메뉴 중에서 원하는 것을 고르세요.")
    println ("")

    val menu = List()
    val money=Money()
    var selectNumber: Int

    while (true) {
        menu.menuList()
        selectNumber = readLine()?.toIntOrNull() ?: -1

        when (selectNumber) {
            1 -> primiumWapper(menu, money)
            2 -> wapper(menu, money)
            3 -> sideMenu(menu, money)
            4 -> drink(menu, money)
            9 -> pay(money)
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }

    println ("프로그램을 종료합니다.")
}


fun primiumWapper(menu: List, money: Money) {
    val myMenu :ArrayList<PrimiumWapper> = arrayListOf(QuacheeWapper(), ShrimpWapper(), MonsterWapper(), StackerWapper())
    var selectMenu: Int
    menu.primiumList()

    while (true) {
        selectMenu = readLine()?.toIntOrNull() ?: -1

        when (selectMenu) {
            in 1..4 -> {
                myMenu[selectMenu - 1].displayInfo()
                money.total += myMenu[selectMenu-1].price
            }
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}

fun wapper(menu: List, money: Money) {
    val myMenu :ArrayList<Wapper> = arrayListOf(WapperBurger(), CheeseWapper(), BulgogiWapper(), WapperJunior())
    var selectMenu: Int

    while (true) {
        menu.primiumList()
        selectMenu = readLine()?.toIntOrNull() ?: -1

        when (selectMenu) {
            in 1..4 -> {
                myMenu[selectMenu - 1].displayInfo()
                money.total += myMenu[selectMenu-1].price
            }
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}

fun sideMenu(menu: List, money: Money) {
    val myMenu :ArrayList<SideMenu> = arrayListOf(FrenchFried(), NuggetKing(), Coleslaw(), BasackKing())
    var selectMenu: Int

    while (true) {
        menu.primiumList()
        selectMenu = readLine()?.toIntOrNull() ?: -1

        when (selectMenu) {
            in 1..4 -> {
                myMenu[selectMenu - 1].displayInfo()
                money.total += myMenu[selectMenu-1].price
            }
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}

fun drink(menu: List, money: Money) {
    val myMenu :ArrayList<Drink> = arrayListOf(Coke(), Sprite(), Juice(), Coffee())
    var selectMenu: Int

    while (true) {
        menu.primiumList()
        selectMenu = readLine()?.toIntOrNull() ?: -1

        when (selectMenu) {
            in 1..4 -> {
                myMenu[selectMenu - 1].displayInfo()
                money.total += myMenu[selectMenu-1].price
            }
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}

fun pay(money: Money) {
    println ("결제수단을 선택하세요.")
    println ("1. 현금")
    println ("2. 카드")
    println ("3. 주문 취소")
    println ("0. 뒤로 가기")

    val selectMenu = readLine()!!.toInt()

    while (true){
        when (selectMenu) {
            in 1..2 -> {
                if (money.amount >= money.total) {
                    money.amount -= money.total
                    println("결제가 되었습니다.")
                } else {
                    println("잔액이 부족합니다.")
                }
                break
            }

            3 -> {
                println("주문을 취소합니다.")
                money.total = 0
                break
            }

            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }
}