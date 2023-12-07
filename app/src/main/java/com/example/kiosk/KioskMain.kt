package com.example.kiosk


import java.lang.Exception

fun main() {
    println("어서오세요 햄버거 전문점입니다.")

//    var name: String
//    var currentCash: Int = 10000




    while (true) {

        val forHereOrToGo = select("hereOrGo").toString()

        if (forHereOrToGo == "1") {
            println("매장 주문입니다")
        } else {
            println("포장 주문입니다")
        }

        var selectedMenu = select("selectedNum")

        when (selectedMenu) {
            1 -> {
                println("세트 메뉴로 이동합니다")
                menuList(selectedMenu)
            }
            2 -> {
                println("햄버거 단품 메뉴로 이동합니다")
                menuList(selectedMenu)
            }
            3 -> {
                println("사이드 메뉴로 이동합니다")
                menuList(selectedMenu)
            }
            4 -> {
                println("음료 메뉴로 이동합니다")
                menuList(selectedMenu)
            }
            5 -> {
                println("이전 메뉴로 돌아갑니다")
                continue
            }
            else -> {
                println("숫자를 잘못 입력")
            }
        }


    }

//    if (select)
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
        else -> {
            println("")
        }
    }

}

fun menuList (num: Any) {
    when (num) {
        1 -> {
            println("세트 메뉴")
            Menu().menuDetail("불고기버거세트")
            Menu().menuDetail("치즈버거세트")
            Menu().menuDetail("야채버거세트")
            Menu().menuDetail("어린이세트")
        }
        2 -> {
            println("햄버거 단품 메뉴")
            Menu().menuDetail("불고기버거")
            Menu().menuDetail("치즈버거")
            Menu().menuDetail("야채버거")
            Menu().menuDetail("어린이용버거")
        }
        3 -> {
            println("사이드 메뉴")
            Menu().menuDetail("감자튀김")
            Menu().menuDetail("치즈볼")
            Menu().menuDetail("치킨너겟")
            Menu().menuDetail("어니언링")
        }
        4 -> {
            println("음료 메뉴")
            Menu().menuDetail("콜라")
            Menu().menuDetail("사이다")
            Menu().menuDetail("환타")
            Menu().menuDetail("주스")
        }

    }
}