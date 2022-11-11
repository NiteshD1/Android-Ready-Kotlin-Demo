package com.androidready.kotlin_demo

abstract class Features {
    abstract fun displaySpeedInfo()
    fun printBill(billInfo : String){
        println("Bill Information : $billInfo")
    }
}