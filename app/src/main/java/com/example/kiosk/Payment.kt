package com.example.kiosk

class Payment() {
    var currentCash = 20000

    fun discount (totalPrice: Int): Int {
        println("할인수단이 있나요? 있으면 1번 없으면 2번")
        while (true) {
            var dis = readLine()!!.toInt()
            try {
                if (dis == 1 || dis == 2) {
                    if (dis == 1) {
                        println("할인금액 입력")
                        while (true) {
                            try {
                                var discountPrice = readLine()!!.toInt()
                                require(totalPrice > discountPrice)
                                pay(totalPrice - discountPrice)
                                return discountPrice
                            } catch (e: Exception) {
                                println("숫자를 입력")
                            }
                        }

                    } else {
                        pay(totalPrice)
                    }
                } else {
                    println("1 또는 2로 입력")
                }
            } catch (e: Exception) {
                println("1 또는 2의 숫자 입력")
            }
        }
    }
    fun pay (price: Int) {
        if (currentCash < price) {
            println("현재 보유한 현금이 부족합니다 다른 결제수단을 선택해주세요")
            println("카드는 1번, 기프티콘이나 교환권 사용은 2번")
            var otherPay = readLine()!!.toInt()
            while (true) {
                try {
                    when (otherPay) {
                        1 -> {
                            println("카드로 결제합니다")
                            println("결제 금액은 ${price}")
                        }
                        2-> {
                            println("기프티콘이나 교환권으로 결제합니다")
                            println("바코드를 보여주세요")
                        }
                        else -> {
                            println("1 또는 2를 입력해주세요")
                        }
                    }
                } catch (e: Exception) {
                    println("1 또는 2의 숫자를 입력해주세요")
                }
            }
        }else {
            println("현금 결제 진행")
            println("결제 후 잔액은 ${currentCash-price}원")
        }
        println("결제가 완료되었습니다")
    }
}
