package com.example.demodagger2

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var vehicle: Vehicle // val vehicle = Vehicle(Motor())

    @Inject
    lateinit var toyota: Toyota // val toyota = Toyota(Vehicle(Motor()))

    @Inject
    lateinit var car: Car // val car:Car = Toyota()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("SPEED", vehicle.getSpeed().toString())
    }
}
