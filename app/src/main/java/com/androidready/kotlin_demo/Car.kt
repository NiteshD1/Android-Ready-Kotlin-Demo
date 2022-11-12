package com.androidready.kotlin_demo
class Car : Vehicle{
    //var name : String? = null
    var maxSpeed : Int? = null

    init {
        println("First init block is called")
    }

    init {
        println("Second init block is called")
    }

    constructor(type: String, speed : Int){
        this.type = type
        this.maxSpeed = speed
        //age = 44
        println("Car is $type and its speed is $speed")
    }

    constructor(){

    }

    override fun print() {
        super.print()
        println("print from Car Class")
    }

    fun print(messge : String){
        println("print from Car Class $messge")
    }

    companion object{
        fun calculateOnRoadPrice(model:String) {
            println("On road price is calculating for Car with Model Number $model")
        }
        var dummyObj: Any? = null
    }
}