package com.example.demodagger2

import android.os.Bundle
import dagger.android.support.DaggerDialogFragment
import javax.inject.Inject

class MyDialogFragment : DaggerDialogFragment() {
    @Inject
    lateinit var vehicle: Vehicle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}