package com.androidready.kotlin_demo

open class Person : Task {
    lateinit var name: String
    //private var age: Int? = null
    //protected var age: Int? = null
    var age: Int? = null
    set(value) {
        println("age setter is called")
        field = value
    }
    get() {
        println("age getter is called")
        return field
    }
    // private, current class
    // protect, class and subclass
    // public , everywhere
    // internal, from module

    constructor(){
        if(this::name.isInitialized){
            println("name is $name")
        }
    }

    open fun print(){
        age = 23
        println("print from Person Class")
    }

    override fun generateHealthReport() {
        println("Generating Health Report...")
    }
}