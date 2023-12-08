package com.example.kiosk

class MenuPrice() {
    var menuPrice = 5000
    var priceMap = mutableMapOf<String, Int>()
    fun price(menu: String): Int? {
        when (menu) {
            "불고기버거" -> {
                priceMap.put(menu, 6000)
            }
            "치즈버거" -> {
                priceMap.put(menu, 6500)
            }
            "야채버거" -> {
                priceMap.put(menu, 5500)
            }
            "어린이용버거" -> {
                priceMap.put(menu, 4000)
            }
            "감자튀김" -> {
                priceMap.put(menu, 3000)
            }
            "치즈볼" -> {
                priceMap.put(menu, 5000)
            }
            "치킨너겟" -> {
                priceMap.put(menu, 4000)
            }
            "어니언링" -> {
                priceMap.put(menu, 4000)
            }
            "콜라" -> {
                priceMap.put(menu, 3000)
            }
            "사이다" -> {
                priceMap.put(menu, 3000)
            }
            "환타" -> {
                priceMap.put(menu, 3000)
            }
            "주스" -> {
                priceMap.put(menu, 3500)
            }
        }
        return priceMap[menu]
    }


}