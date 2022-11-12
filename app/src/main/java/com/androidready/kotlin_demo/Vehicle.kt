package com.androidready.kotlin_demo

open class Vehicle : Features {
    lateinit var type: String
    //private var age: Int? = null
    //protected var age: Int? = null
    var price: Int? = null
        set(value) {
            println("price setter is called")
            field = value
        }
        get() {
            println("price getter is called")
            return field
        }
    // private, current class
    // protect, class and subclass
    // public , everywhere
    // internal, from module

    constructor(){
        if(this::type.isInitialized){
            println("type is $type")
        }
    }

    open fun print(){
        price = 23
        println("print from vehicle Class")
    }

    override fun displaySpeedInfo() {
        println("Generating Speed Report...")
    }
}