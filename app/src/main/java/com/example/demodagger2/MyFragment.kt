package com.example.demodagger2

import android.os.Bundle
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class MyFragment : DaggerFragment() {
    @Inject
    lateinit var vehicle: Vehicle

    @Inject
    lateinit var motor: Motor // motor = Motor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}