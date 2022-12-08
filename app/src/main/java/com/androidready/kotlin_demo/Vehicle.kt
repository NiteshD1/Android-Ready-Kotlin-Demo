package com.androidready.kotlin_demo

open class Vehicle() : Feature() {
    var type : String? = null

    constructor(type:String) : this() {
        this.type = type
    }

    open fun print(){
        println("print of vehicle called")
    }

    override fun displayEngineFeature() {
        println("Displaying Engine Feature")
    }

}