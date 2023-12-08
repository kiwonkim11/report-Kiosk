package com.example.kiosk


import kotlin.Exception

fun main() {

    var totalPrice = 0
    var forHereOrToGo = "1"

while (true) {

    println("어서오세요 햄버거 전문점입니다.")

    while (true) {

        forHereOrToGo = select("hereOrGo").toString()

        if (forHereOrToGo == "1") {
            println("매장 주문입니다")
        } else {
            println("포장 주문입니다")
        }


        while (true) {
            var selected = select("selectedNum")

            when (selected) {
                1 -> {
                    println("세트 메뉴로 이동합니다")
                    menuList(selected)
                }

                2 -> {
                    println("햄버거 단품 메뉴로 이동합니다")
                    menuList(selected)
                }

                3 -> {
                    println("사이드 메뉴로 이동합니다")
                    menuList(selected)
                }

                4 -> {
                    println("음료 메뉴로 이동합니다")
                    menuList(selected)
                }

                5 -> {
                    println("이전 메뉴로 돌아갑니다")
                    totalPrice = 0
                    break
                }

                else -> {
                    println("숫자를 잘못 입력")
                }
            }
            selected = select("selectedMenu")

            totalPrice += Order().orderMenu(selected.toString())
            println("현재 결제할 금액은 ${totalPrice}원")

            if (finishSelect() == 1) {
                Payment().discount(totalPrice)
            } else continue

        }
    }

}

}

fun select (choice: String): Any {
    return when(choice) {
        "hereOrGo" -> {
            println("드시고 가시나요 아니면 포장해 가시나요? (드시고 가면 1, 포장해 가면 2 입력)")
            while (true) {
                try {
                    val hereOrGo = readLine()
                    if (hereOrGo?.equals("1") == true || hereOrGo?.equals("2") == true){
                        return hereOrGo
                    } else {
                        println("1 또는 2로 입력")
                    }
                }catch (e: Exception) {
                    println("1 또는 2로 입력")
                }
            }

        }
        "selectedNum" -> {
            println("음식 종류를 선택해주세요")
            println("1 세트")
            println("2 햄버거 단품")
            println("3 사이드")
            println("4 음료")
            println("5 뒤로가기")
            while (true) {
                try {
                    var selectedNum: Int? = readLine()!!.toInt()
                    return selectedNum ?:-1
                } catch (e: Exception) {
                    println("숫자를 입력해주세요")
                }
            }


        }
        "selectedMenu" -> {
            var allMenu = arrayOf("불고기버거", "치즈버거", "야채버거", "어린이용버거", "감자튀김", "치즈볼", "치킨너겟", "어니언링", "콜라", "사이다", "환타", "주스")
            println("주문할 메뉴를 선택하세요")
            while (true) {
                try {
                    var selectedMenu = readLine().toString()
                    if (selectedMenu in allMenu) {
                        return selectedMenu
                    }else {
                        println("목록에 있는 메뉴를 선택하세요")
                    }
                } catch (e: Exception) {
                    println("메뉴를 입력해주세요")
                }
            }

        }
        else -> {
            println("")
        }
    }

}

fun menuList (num: Any) {
    when (num) {
        1 -> {
            println("세트 메뉴")
//            Menu().menuDetail("불고기버거세트")
//            Menu().menuDetail("치즈버거세트")
//            Menu().menuDetail("야채버거세트")
//            Menu().menuDetail("어린이세트")
        }
        2 -> {
            println("햄버거 단품 메뉴")
            BurgerMenu().menuDetail("불고기버거")
            BurgerMenu().menuDetail("치즈버거")
            BurgerMenu().menuDetail("야채버거")
            BurgerMenu().menuDetail("어린이용버거")
        }
        3 -> {
            println("사이드 메뉴")
            SideMenu().menuDetail("감자튀김")
            SideMenu().menuDetail("치즈볼")
            SideMenu().menuDetail("치킨너겟")
            SideMenu().menuDetail("어니언링")
        }
        4 -> {
            println("음료 메뉴")
            DrinkMenu().menuDetail("콜라")
            DrinkMenu().menuDetail("사이다")
            DrinkMenu().menuDetail("환타")
            DrinkMenu().menuDetail("주스")
        }

    }


}

fun finishSelect(): Int{
    println("결제하시겠습니까? 결제하려면 1, 계속 담으시려면 2")
    while (true){
        try {
            var pay = readLine()!!.toInt()
            if (pay == 1 || pay ==2) {
                return pay
            }else {
                println("1 또는 2로 입력")
            }
        } catch (e: Exception) {
            println("1 또는 2의 숫자 입력")
        }

    }
}