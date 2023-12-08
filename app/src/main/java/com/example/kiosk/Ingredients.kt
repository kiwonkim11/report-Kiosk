package com.example.kiosk

class Ingredient() {
    private var burgerIngredient = arrayListOf<String>("빵", "토마토", "양상추")
    private var sideIngredient = mutableListOf<String>()
//    var DrinkIngredient = mutableListOf<String>()

    fun whatIng(menu: String): Any {
        when (menu) {
            "불고기버거" -> {
                burgerIngredient.add("불고기")
                return burgerIngredient
            }
            "치즈버거" -> {
                burgerIngredient.add("치즈")
                return burgerIngredient
            }
            "감자튀김" -> {
                sideIngredient.add("감자")
                return sideIngredient
            }
            "치즈볼" -> {
                sideIngredient.addAll(listOf("치즈", "찹쌀"))
                return sideIngredient
            }
            "치킨너겟" -> {
                sideIngredient.add("닭고기")
                return sideIngredient
            }
            "어니언링" -> {
                sideIngredient.add("양파")
                return sideIngredient
            }
            else -> {
                return burgerIngredient
            }

        }
    }
}