package com.androidready.kotlin_demo
val name = "Ram"
fun main(){
//    println("Hello Kotlin")
//    println("Hello Kotlin")

    var num: Long = 50L
    var student = Student()
    val arr = arrayOf(4,5,'c',"Str",student)
//    println(name)
//    println("num is : ${num+5}")
//    println("num is : " + num)
//    println(Student.gender)

    var name1 : String? = null
    if (name1 != null) {
        println(name1.length)
    }
//    println(name1?.length)
//    println(name1?.length ?: "variable is null")
//    println(name1!!.length)

    val a = 5
    val b = 7
    var max = 0

    if(a > b){
        max = a
    }else{
        max = b
    }

    println("Max is $max")

    val result = 10

    when(result){
        1 -> println("Result is 1")
        2 -> println("Result is 2")
        3,4 -> println("Result is 3 or 4")
        5 -> println("Result is 5")
        in 6..10 -> println("result in between 6 to 10")
        else -> println("No result found")

    }

    var whenResult =
        when(result){
            1 -> "Result is 1"
            2 -> "Result is 2"
            else -> "No result found"
        }
    println("whenResult is $whenResult")

    val array = arrayOf(3,4,5,3,5)
//    for (item in array){
//        println(item)
//    }

//    for(i in 1..4){
//        println(i)
//    }

//     for(i in 1 until 4){
//         println(i)
//     }
//
//     for(i in 4 downTo 1){
//         println(i)
//     }

//    for(i in 4 downTo 1 step 2){
//        println(i)
//    }

    var i = 0
//
//    while (i < 4){
//        println(i)
//        i++
//    }
//
//    do {
//        println(i)
//        i++
//    }while (i<6)

//    outer@for (i in 1..2){
//        inner@for(j in 1..2){
//            if(i == 1) continue@inner
//            println("i is $i and j is $j")
//        }
//    }

    calculateSum(5,6,1,2,3,4)

//    var myLambada1 : (Int,Int) -> Unit = {num1:Int,num2:Int ->
//        println("myLambada is $num1 $num2")
//    }

    var myLambada : (Int) -> Unit = {
        println("myLambada is $it")
    }

    var myReturningLambada : (Int) -> String = {
        "myReturningLambada is $it"
    }

    var name : String = "Rohit"

    calculateSumWithLambada(5,6,myLambada)
    println(calculateSumWithReturningLambada(5,5,myReturningLambada))

    var str: String = "String"
    println(str.doubleLength())
    println(2.isEven())
    println(1.isEven())

}

fun String.doubleLength() : Int{
    return this.length * 2
}

fun Int.isEven(): Boolean{
    return this % 2 == 0
}

fun dummyFun() = println(name)

fun calculateSum(a : Int = 0, b : Int,vararg arr : Int){
    println(a+b)
    println(arr.toList())
}

fun calculateSumWithLambada(a:Int,b:Int,myLambada : (Int) -> Unit){
    val sum = a+b;
    myLambada(sum)
}

fun calculateSumWithReturningLambada(a:Int,b:Int,myReturningLambada : (Int) -> String) : String{
    val sum = a+b;
    return myReturningLambada(sum)
}

class Student{

    companion object{
        val gender = "MALE"
    }

}