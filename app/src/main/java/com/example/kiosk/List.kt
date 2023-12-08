package com.example.kiosk

class List {
    fun menuList() {
        println ("[ 메인 메뉴판 ]")
        println ("1. 프리미엄 와퍼")
        println ("2. 와퍼")
        println ("3. 사이드메뉴")
        println ("4. 음료")
        println ("9. 결제")
        println ("0. 종료")
    }

    fun primiumList() {
        println ("[ 프리미엄 와퍼 ]")
        println ("1. 콰트로치즈와퍼 | ￦7,900")
        println ("2. 통새우와퍼    | ￦7,900")
        println ("3. 몬스터와퍼    | ￦9,300")
        println ("4. 스태커4 와퍼  | ￦13,300")
        println ("0. 뒤로 가기")
    }

    fun wapperList() {
        println ("[ 와퍼 ]")
        println ("1. 와퍼         | ￦7,100")
        println ("2. 치즈와퍼      | ￦7,700")
        println ("3. 불고기와퍼    | ￦7,400")
        println ("4. 와퍼주니어    | ￦4,700")
        println ("0. 뒤로 가기")
    }

    fun sideList() {
        println("[ 사이드메뉴 ]")
        println("1. 감자튀김     | ￦2,100")
        println("2. 너겟킹       | ￦2,200")
        println("3. 코울슬로     | ￦2,100")
        println("4. 바삭킹       | ￦3,000")
        println("0. 뒤로 가기")
    }

    fun drinkList() {
        println ("[ 음료 ]")
        println ("1. 콜라         | ￦2,000")
        println ("2. 스프라이트    | ￦2,000")
        println ("3. 오렌지쥬스    | ￦2,800")
        println ("4. 아메리카노    | ￦1,500")
        println ("0. 뒤로 가기")
    }

    fun payList() {
        println ("결제수단을 선택하세요.")
        println ("1. 현금")
        println ("2. 카드")
        println ("0. 뒤로 가기")
    }
}