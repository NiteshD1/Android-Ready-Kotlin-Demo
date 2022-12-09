package com.androidready.kotlin_demo

fun main() {

    var bike = Bike()
    bike.brandName = "Honda"
    println(bike.brandName)

    var obj: Any = "Hello"

    if(obj is String){ // smart cast
        println(obj.length)
    }

    var bike1 = Bike()
    bike1.price = 200000.0
    bike1.brandName = "Hero"
    bike1.type = "two wheeler"

    bike1.apply {
        this.price = 200000.0
        brandName = "hero"
        type = "two wheeler"
    }

    var list = mutableListOf<Int>(1,2,3,4,5)

    list.also {
        it.add(6)
        it.remove(3)
    }
    println(list.toString())

    var name : String? = null

    name?.let {
        println(name.length)
    }
    name.let{
        println(name?.length)
    }

    with(bike1){
        displayFuelFeature()
        displayEngineFeature()
    }

    bike1?.run {
        displayEngineFeature()
        displayFuelFeature()
    }

    bike1.displayAllFeature()

    divideByZero()

    var type = VehicleType.FOUR_WHEELER
    println(type.name)
    println(VehicleType.TWO_WHEELER.numberOfWheels)

    var carBrand : CarBrands = CarBrands.Kia()
    when(carBrand){
        is CarBrands.Kia -> println("Kia car")
        is CarBrands.Maruti -> println("Maruti Car")
        else -> println("No Brand Match")
    }


    var myJava = MyJava()
    myJava.setName("Rahul")
    println(myJava.getName())
}

fun divideByZero(){
    var divideBy = 0

//    if(divideBy == 0){
//        throw ArithmeticException("divide by zero not possible")
//    }
    try {
        var result = 5/divideBy
        println(result)
    }catch (e: Exception){
        println("some exception occured ${e.message}")
    }finally {
        println("Entered in finally block")
    }


}