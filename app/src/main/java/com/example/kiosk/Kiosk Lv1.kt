package com.example.kiosk

fun main() {
    println ("어서오세요 고객님.")
    println ("아래의 메뉴 중에서 원하는 것을 고르세요.")
    println ("")
    println ("[ 메인 메뉴판 ]")
    println ("1. 프리미엄 와퍼")
    println ("2. 와퍼")
    println ("3. 사이드메뉴")
    println ("4. 음료")
    println ("9. 결제")
    println ("0. 종료")

    val keepgoing: Int = 1
    var basket = intArrayOf()

    while (keepgoing != 0) {
        var selectNumber = readLine()!!.toInt()

        when (selectNumber) {
            1 -> primiumWapper()
            2 -> wapper()
            3 -> sideMenu()
            4 -> drink()
            9 -> pay()
            0 -> break
            else -> println("유효하지 않은 번호입니다.")
        }
    }

    println ("프로그램을 종료합니다.")
}

fun primiumWapper() {
    println ("[ 프리미엄 와퍼 ]")
    println ("1. 콰트로치즈와퍼 | ￦7,900")
    println ("2. 통새우와퍼    | ￦7,900")
    println ("3. 몬스터와퍼    | ￦9,300")
    println ("4. 스태커4 와퍼  | ￦13,300")
    println ("0. 뒤로 가기")

}

fun wapper() {
    println ("[ 와퍼 ]")
    println ("1. 와퍼         | ￦7,100")
    println ("2. 치즈와퍼      | ￦7,700")
    println ("3. 불고기와퍼    | ￦7,400")
    println ("4. 와퍼주니어    | ￦4,700")
    println ("0. 뒤로 가기")
}

fun sideMenu() {
    println ("[ 사이드메뉴 ]")
    println ("1. 감자튀김     | ￦2,100")
    println ("2. 너겟킹       | ￦2,200")
    println ("3. 코울슬로     | ￦2,100")
    println ("4. 바삭킹       | ￦3,000")
    println ("0. 뒤로 가기")

}

fun drink() {
    println ("[ 음료 ]")
    println ("1. 콜라         | ￦2,000")
    println ("2. 스프라이트    | ￦2,000")
    println ("3. 오렌지쥬스    | ￦2,800")
    println ("4. 아메리카노    | ￦1,500")
    println ("0. 뒤로 가기")
}

fun pay() {
    println ("결제수단을 선택하세요.")
    println ("1. 현금")
    println ("2. 카드")
    println ("0. 뒤로 가기")
}