package com.androidready.kotlin_demo

class Bike() : Vehicle(),FeatureInterface {
    var brandName: String? = null
    set(value){
        println("brandName setter is called")
        field = value;
    }
    get(){
        println("brandName getter is called")
        return field
    }

    var price : Double? = null


    override fun displayAllFeature() {
        println("displaying all feature")
    }

}