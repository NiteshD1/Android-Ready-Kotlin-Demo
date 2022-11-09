package com.androidready.kotlin_demo

fun main() {

    var student = Student("Rahul",22)
    //student.print()
    //student.print("with some custom messge")
    var student1 = Student()

    //Abstraction
    //var task = Task()
    val person = Person()

    //person.generateHealthReport()

    //data class
    println(person)
    var doctor = Doctor("Rahul",45)

    println(doctor)
}