package com.androidready.kotlin_demo

fun main() {
    var intArray = arrayOf(2,3,4,5)

    var name : String = "Rohit"
    var myLambada : (Int) -> Unit = {
        println("Number is $it")
    }

 //   intArray.forEach(myLambada)
//    intArray.forEach {
//        println("Number is $it")
//    }

//    intArray.forEach {
//        println("Number is $it")
//    }

//    for (item in intArray){
//        println("Number is $item")
//    }

    var nameList : List<String> = listOf("Ram","Rohit","Shyam")

//    nameList.forEach{
//        println("Name is $it")
//    }
//    println(nameList.toString())
//    println(nameList[0])
//    println(nameList.get(0))
//    println(nameList.subList(0,1))
//    println(nameList.size)
//    println(nameList.contains("Ram"))
//    println(nameList.isEmpty())

    var mutableNameList = mutableListOf<String>("Krishna","Rohit","Naman")

    mutableNameList.add("Deepak")
    mutableNameList.add(0,"Deepak")
    mutableNameList.remove("Deepak")
    //mutableNameList.clear()
    val nameArray = arrayOf("Naman","Shivay")
    mutableNameList.addAll(nameArray)
    //println(mutableNameList.toString())

    var nameSet = setOf<String>("Naman","Ram")
    var mutableNameSet = mutableSetOf<String>("Naman","Ram")

    mutableNameSet.addAll(mutableNameList)
   // println(mutableNameSet.toString())

    var nameMap = mapOf<Int,String>(1 to "Ram",2 to "Shyam",3 to "Ram")
   // println(nameMap.toString())

//    var mutableNameMap = nameMap
    var mutableNameMap = mutableMapOf<Int,String>(0 to "Shyam")

    mutableNameMap.put(1,"Naman")
 //   println(mutableNameMap.toString())

    mutableNameMap.putAll(nameMap)
//    println(mutableNameMap.toString())
//
//    println(mutableNameMap[0])

    var numberArray = intArrayOf(2,4,7,22,33)

    //println(isAllGreaterThanZero(numberArray))

    var isAllGreaterThanZero = numberArray.all {
        it > 0
    }
    //println(isAllGreaterThanZero)

    var bool1 = numberArray.any{
        it> 44
    }
    println(bool1)

    var count = numberArray.count{
        it> 0
    }
    println(count)

    var item = numberArray.find {
        it> 0
    }
    println(item)

    var filteredArray = numberArray.filter {
        it > 10
    }

    println(filteredArray.toString())

    var mapArray = numberArray.map{
        it + it
    }
    println(mapArray)

}

fun isAllGreaterThanZero(numberArray: IntArray): Boolean{
    for(item in numberArray){
        if(item <= 0) return false
    }
    return true
}