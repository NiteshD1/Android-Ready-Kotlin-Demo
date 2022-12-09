package com.androidready.kotlin_demo

fun main(){

    // backing field
    var vehicle = Vehicle()
    vehicle.price = 400000
    println(vehicle.price)

    // elvis operator
    var str: String? = null
    var str2: String? = "May be declare nullable string"
//    var len1:  Int = if (str != null) str.length else -1
//    var len2:  Int = if (str2 != null) str2.length else -1
//    println("Length of str is ${len1}")
//    println("Length of str2 is ${len2}")

//    var len1:  Int = str ?.length ?: -1
//    var len2:  Int = str2 ?.length ?:  -1
//
//    println("Length of str is ${len1}")
//    println("Length of str2 is ${len2}")

    // smart cast
    var obj : Any = "Hello!"
    if(obj is String) { // smart cast
        println(obj.length) // It works now!
    }

    var obj1: String? = null

    // scope functions
    obj1?.let {
        // enter if obj is not null
        println("let called with safe $it")
    }

    obj = "Android"

    obj1.let {
        println("let called without safe $it")
    }

    var vehicle1: Vehicle? = Vehicle().apply {
        type = Constants.TWO_WHEELER
        price = 100000
        println(type)
    }

//    with(vehicle){
//        println(this?.type)
//        println(this!!.price)
//    }

//    vehicle?.run {
//        println(type)
//        println(price)
//    }

    val list = mutableListOf<Int>(1, 2, 3)

    // later if we want to perform
    // multiple operations on this list
    list.also {
        it.add(4)
        it.remove(2)
        // more operations if needed
    }
    println(list)

    // companion object
    Car.calculateOnRoadPrice("xt3452")
    Car.dummyObj = 12
    println(Car.dummyObj)

    // enum

    println(VehicleEnum.CAR.color)
    println(VehicleEnum.CAR.ordinal)

    VehicleEnum.CAR.color = "green"
    println(VehicleEnum.CAR.color)

    for(card in VehicleEnum.values()){
        println(card.color)
    }
    //println(VehicleEnum.valueOf("Heart"))

}