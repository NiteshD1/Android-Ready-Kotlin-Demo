package com.androidready.kotlin_demo

enum class VehicleType(var numberOfWheels : Int) {
    TWO_WHEELER(2),
    FOUR_WHEELER(numberOfWheels = 4 )
}