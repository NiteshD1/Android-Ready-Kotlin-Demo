package com.androidready.kotlin_demo

fun main() {

    var car = Car(Constants.FOUR_WHEELER,100)
    //car.print()
    //car.print("with some custom messge")
    var car1 = Car()

    //Abstraction
    //var task = Task()
    val vehicle = Vehicle()

    vehicle.displaySpeedInfo()

    //data class
    println(vehicle)
    var engine = Engine("xt354",50000)

    println(engine)
}