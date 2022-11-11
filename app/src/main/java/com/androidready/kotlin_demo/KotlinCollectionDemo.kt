package com.androidready.kotlin_demo

import kotlin.time.measureTime

fun main(){

    val intArray = intArrayOf(5,3,4,5)

    val arr = arrayOf(2,3.0,"Ram",Car(),true)
    intArray.forEach {
        println("Number is $it")
    }

//    for(number in intArray){
//        println("Number is $number")
//    }

    for(item in arr){
        println(item)
    }
    
    val stringList : List<String> = listOf<String>("Ram","Shyam","Rohit")
    for(str in stringList){
        println(str)
    }
    println(stringList[0])
    println(stringList.get(1))
    println(stringList.size)
    println(stringList.contains("Ram"))
    println(stringList.subList(1,2))
    println(stringList.isEmpty())


    var mutableNameList = mutableListOf<String>("Ram","Shyam","Rohit")
    mutableNameList.add(0,"Rahul")
    println(mutableNameList[0])

    mutableNameList.addAll(stringList)
    mutableNameList.forEach{
        println(it)
    }
    mutableNameList.removeAt(0)
    mutableNameList.remove("Rohit")
    mutableNameList.forEach{
        println(it)
    }

    println("---------------------------")

    var nameSet = setOf<String>("Rahul","Saurabh","Deepak","Rahul","Rahul")
    println(nameSet.toString())

    var mutableNameSet = mutableSetOf<String>("Rahul","Saurabh","Deepak","Rahul","Rahul")

    mutableNameSet.remove("Rahul")
    mutableNameSet.add("Nitesh")
    println(mutableNameSet.toString())

    mutableNameSet.addAll(mutableNameList)
    println(mutableNameSet.toString())

    println("---------------------------")

    var nameMap = mapOf<Int,String>(1 to "Nitesh",2 to "Lakhan")

    for(item in nameMap){
        println("Name at index ${item.key} is ${item.value}")
    }
    println(nameMap[1])

    println(nameMap.toString())

    var mutableNameMap = mutableMapOf<Int,String>(0 to "Shyam",2 to "Raj")
    println(mutableNameMap.toString())

    mutableNameMap.put(0,"Rahul")
    println(mutableNameMap.toString())

    mutableNameMap[3] = "Raj"
    println(mutableNameMap.toString())

    mutableNameMap.putAll(nameMap)
    println(mutableNameMap.toString())

    println("---------------------------")

    // predicates, all,any,count,find

    var dummyNumList = listOf<Int>(5,22,34,54,2,3)
    val bool1 = dummyNumList.all { it -> it > 20 }
    println(bool1)

    val bool2 = dummyNumList.any { it -> it > 20 }
    println(bool2)

    val count = dummyNumList.count { it -> it > 20 }
    println(count)

    val firstNum = dummyNumList.find { it -> it > 20 }
    println(firstNum)


    // filter and map

    var dummyList = listOf<Any>("Ram",2,4,"Shyam",5)
    var numList: List<Int> = dummyList.filter { it -> it is Int } as List<Int>

    println(numList.toString())

    var updatedList = numList.map { it -> it + it }
    println(updatedList.toString())

}