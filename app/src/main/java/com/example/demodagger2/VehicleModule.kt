package com.example.demodagger2

import dagger.Binds
import dagger.Module

@Module
abstract class VehicleModule {

//    @Provides
//    @Singleton
//    fun provideMotor(): Motor {
//        return Motor()
//    }

//    @Provides
//    fun provideVehicle(motor: Motor): Vehicle {
//        return Vehicle(motor)
//    }

//    @Provides
//    fun provideCar(vehicle: Vehicle): Car {
//        return Car(vehicle)
//    }

    @Binds // val toyota : Car = Totota()
    abstract fun bindCar(toyota: Toyota): Car
}
