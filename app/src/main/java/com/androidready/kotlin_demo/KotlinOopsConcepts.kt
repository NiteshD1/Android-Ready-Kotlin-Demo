package com.androidready.kotlin_demo

fun main(){

    val car = Car("XYZ",700000.0)
    car.print()
    car.print("Function overloading")
    car.displayEngineFeature()

    var engine = Engine("ABC",5000.0)
    println(engine)
    //var engine1 = engine

    var engine1 = engine.copy("XYZ")
    println(engine1)


}