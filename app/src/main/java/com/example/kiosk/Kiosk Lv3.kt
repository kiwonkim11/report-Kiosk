package com.example.kiosk

var menus: MutableList<Menu> = ArrayList()
var foods: MutableList<Food> = ArrayList()

fun main() {
    init()

    while (true) {
        displayMenu()
        var selectNumber = getNumber()

        if (selectNumber == 0) break

        var selectedFood = selectMenu(selectNumber)
        }

    println ("프로그램을 종료합니다.")
}

fun init () {
    menus.add(Menu("프리미엄 와퍼"))
    menus.add(Menu("와퍼"))
    menus.add(Menu("사이드 메뉴"))
    menus.add(Menu("음료"))

    //프리미엄 와퍼 추가
    foods.add(Food("콰트로치즈와퍼", 7900, "프리미엄 와퍼"))
    foods.add(Food("통새우와퍼", 7900, "프리미엄 와퍼"))
    foods.add(Food("몬스터와퍼", 9300, "프리미엄 와퍼"))
    foods.add(Food("스태커와퍼", 13300, "프리미엄 와퍼"))

    //와퍼 추가
    foods.add(Food("와퍼", 7100, "와퍼"))
    foods.add(Food("치즈와퍼", 7700, "와퍼"))
    foods.add(Food("불고기와퍼", 7400, "와퍼"))
    foods.add(Food("와퍼주니어", 4700, "와퍼"))

    //사이드메뉴 추가
    foods.add(Food("감자튀김", 2100, "사이드 메뉴"))
    foods.add(Food("코울슬로", 2100, "사이드 메뉴"))
    foods.add(Food("너겟킹", 2200, "사이드 메뉴"))
    foods.add(Food("바삭킹", 2100, "사이드 메뉴"))

    //음료 추가
    foods.add(Food("콜라", 2000, "음료"))
    foods.add(Food("스프라이트", 2000, "음료"))
    foods.add(Food("오렌지쥬스", 2800, "음료"))
    foods.add(Food("아메리카노", 1500, "음료"))
}

fun displayMenu() {
    println("어서오세요 고객님.")
    println("아래의 메뉴 중에서 원하는 것을 고르세요.")

    var menuSize = menus.size
    var count = 1
    for (idx in 1..menuSize) {
        val menu = menus[idx-1]
        val name = menu.name
        println ("$idx. $name")
        count++
    }
    println ("0. 종료")
}

fun displayMenuDetail (categoryName: String) {
    println("\n[ $categoryName ]")

    var filteredFoods = foods.filter { it.category == categoryName }

    val maxNameLength = filteredFoods.maxOfOrNull { it.name.toString().length } ?: 0
    var foodSize = filteredFoods.size
    for(i in 1..foodSize) {
        val food = filteredFoods[i-1]
        val name = food.name
        val price = food.price
        val namePadding = " ".repeat(maxNameLength - name.length)
        println("$i. $name$namePadding | W $price")
    }
    println("0. 뒤로 가기")
}

fun getNumber(): Int {
    var userInput: String?
    var number: Int?

    while(true){
        print("번호를 입력해주세요.")
        userInput = readLine()
        number = userInput?.toIntOrNull()

        if(number != null) {
            return number
        } else {
            println("올바른 숫자를 입력해주세요")
        }
    }
}

fun selectMenu(cateNumber: Int) : Food? {
    var menu = menus[cateNumber - 1]
    var categoryName = menu.name

    if (categoryName != "Cancel") {
        var filteredFoods = foods.filter { it.category == categoryName }
        displayMenuDetail(categoryName)

        while (true) {
            var selectFoodNumber = getNumber()
            if (selectFoodNumber > filteredFoods.size || selectFoodNumber < 0) {
                println("올바른 숫자를 입력해주세요")
            } else if (selectFoodNumber == 0) {
                return null
            } else {
                return filteredFoods[selectFoodNumber - 1]
            }
        }
    }
    return TODO("Provide the return value")
}