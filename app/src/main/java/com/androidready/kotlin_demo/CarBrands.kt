package com.androidready.kotlin_demo

sealed class CarBrands{
    class Maruti : CarBrands(){

    }

    class Kia : CarBrands(){

    }
}

class Honda : CarBrands(){

}
