package com.example.kiosk

open class Menu (name: String) {
    var idx: Int
    var name: String

    init {
        this.idx = getNextIdx()
        this.name = name
    }

    open fun displayInfo () {
        println ("ID: $idx, 이름: $name")
    }

    companion object {
        private var maxIdx = 1

        private fun getNextIdx(): Int {
            return maxIdx++
        }
    }
}