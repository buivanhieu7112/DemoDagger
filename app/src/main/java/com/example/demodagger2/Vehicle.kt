package com.example.demodagger2

import javax.inject.Inject

class Vehicle @Inject constructor(var motor: Motor) {

    fun increaseSpeed(value: Int) {
        motor.accelerate(value)
    }

    fun stop() {
        motor.brake()
    }

    fun getSpeed(): Int {
        return motor.rpm
    }
}
