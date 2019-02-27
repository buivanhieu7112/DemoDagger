package com.example.demodagger2

import javax.inject.Inject

class Motor @Inject constructor() {

    var rpm: Int

    init {
        this.rpm = 0
    }

    fun accelerate(value: Int) {
        rpm += value
    }

    fun brake() {
        rpm = 0
    }
}
