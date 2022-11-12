package com.androidready.kotlin_demo

import java.lang.ArithmeticException
import kotlin.properties.Delegates

fun main() {
//    print("hello")
    println("Hi Welcome in the world of kotlin.")

    val salary = 3000
    var language = "Kotlin"
    var intArray: IntArray = intArrayOf(3,4,5,4)
    var arr = arrayOf(3,4,"Ram",CustomObject())

    println("Your salary is $salary and language is $language . You can print both together ${salary + 2000}")

    val longVar:Long = salary.toLong()

    // show without nullable type (?), with(non null assertion operator) !!, with ?
    val isNull : Boolean? = null
    println(isNull);

    var a = 5
    var b = 7
    var max : Int

//    if(a>b){
//        max = a
//    }else{
//        max = b
//    }

//    max = a > b ? a : b

//    max = if(a>b) a else b
//    println("Max value is $max")
//
//    println("Enter Your Name :")
//    val name = readLine()
//
//    println("Enter Your Age :")
//    val age = Integer.valueOf(readLine())
//
//    println("Name is : $name and Age is : $age")

    val result = 15

    when(result){
        1 -> println("Result is one")
        2 -> println("Result is two")
        3 -> println("Result is three")
        4 -> println("Result is four")
        5,6,7,8,9 -> println("Result is Greater than 4 and less than 10")
        in 10..15 -> {
            println("Result is Greater than 9")
            println("Result is less than 16")
        }
        else -> println("Number is greater than 4")
    }


    val whenResult = when(result){
        0 -> 0
        1 -> "Result is one"
        2 -> "Result is two"
        3 -> "Result is three"
        4 -> "Result is four"
        5,6,7,8,9 -> "Result is Greater than 4 and less than 10"
        else -> "greater than 9"
    }

    println(whenResult)

    val array = arrayOf(22,23,34,54)

//    for (item in array){
//        println(item)
//    }

//    for (i in 1..4) println(i)
//    for (i in 1 until 4) println(i)
//
//    for (i in 4 downTo 1) println(i)
//    for (i in 4 downTo 1 step 2) println(i)

//    var i = 0
//    while (i < 3) {
//        println(i)
//        i++
//    }
//    i = 0
//
//    do {
//        println(i)
//        i++;
//    }while (i<3)

//    outerloop@ for (i in 1..5){
//        println("i is $i")
//        for (j in 1..5){
//            println("j is $j")
//            if(j==3)
//                break@outerloop
//        }
//    }

//    for (i in 1..3) {  // i in 1.rangeTo(3)
//        println("i = $i")
//        if (i == 2) {
//            continue
//        }
//        println("this is below if")
//    }

    var sum = calculateSum(5,6)
    println(sum)

    sum = calculateSum(b = 45, a = 5)
    println(sum)

    println(calculateSum(5))

    // lambada function with no name
    var resultLambada : (Int) -> Unit = {
        var finalResult = it + 5
        println("Result is $finalResult")
    }

    // ignore lambada parameter wth _
    var resultLambada2 : (Int,String) -> String = { sumResult : Int, _ ->
        var finalResult = sumResult + 5
        "Result is $finalResult"
    }

    var resultLambada1 : (Int,String) -> String = { sumResult : Int, text : String ->
        var finalResult = sumResult + 5
        "Result is $finalResult and text is : $text"
    }

    calculateSumWithLambada(5,10,resultLambada)

    println(calculateSumWithReturningLambada(5,10,resultLambada1))

    divideByZero()

    println("is 2 Even : ${2.isEven()}")

}

fun Int.isEven(): Boolean{
    return this % 2 == 0
}

fun divideByZero(){
    var num : Int
    var divideBy = 0

    //   In Kotlin, we use throw keyword to throw an explicit exception. It can also be used to throw a custom exception.
//    if(divideBy == 0){
//        throw ArithmeticException("divideBy can not be zero")
//    }

    try {
        num = 1/divideBy
        println("Number is $num")
    }catch(e: Exception){
        println("Exception is ${e.message}")
    }

    calculateSum(5,1,2,3,4)

}

fun calculateSum(a: Int, b : Int = 2): Any {
    println("a is $a, b is $b")
    return a + b
}

fun calculateSum(a: Int,vararg arr : Int){
    println("a is $a")
    println("arr is ${arr[0]}")
}

// higher order function, it uses lambada function
fun calculateSumWithLambada(a: Int, b : Int = 2,myLambada : (Int) -> Unit): Unit {
    println("a is $a, b is $b")
    myLambada(a + b)
}

fun calculateSumWithReturningLambada(a: Int, b : Int = 2,myLambada : (Int,String) -> String): String {
    println("a is $a, b is $b")
    val sum = a + b
    return myLambada(sum,"Just Dummy text wit retuning lambada")
}

class CustomObject(){

}