package com.androidready.kotlin_demo

class Car(modelName: String) : Vehicle() {

    var price : Double? = null
    init {

       println("init block called")
    }

    init {
        println("second init block called")
    }

    constructor(modelName: String, price: Double) : this(modelName) {
        println("secondary constructor called")
        this.price = price

    }

    constructor(modelName: String, price: Double,type : String) : this(modelName) {
        println("secondary constructor called")
        this.type = type
        this.price = price
    }

    override fun print() {
        //super.print()
        println("print of Car called")

    }

    fun print(message : String){
        println("print of Car called with $message")
    }
}