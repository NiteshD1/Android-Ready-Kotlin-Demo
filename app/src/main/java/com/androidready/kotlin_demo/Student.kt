package com.androidready.kotlin_demo
class Student : Person{
    //var name : String? = null
    var rollNumber : Int? = null

    init {
        println("First init block is called")
    }

    init {
        println("Second init block is called")
    }

    constructor(name: String,rollNumber : Int){
        this.name = name
        this.rollNumber = rollNumber
        //age = 44
        println("Student Name is $name and Student roll number is $rollNumber")
    }

    constructor(){
        
    }

    override fun print() {
        super.print()
        println("print from Student Class")
    }

    fun print(messge : String){
        println("print from Student Class $messge")
    }
}