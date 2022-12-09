package com.androidready.kotlin_demo;

public class MyJava {
    String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        MyJava myJava = new MyJava();
        myJava.setName("Anil");
        if(myJava.name != null){

        }
        String name = myJava.getName();

        UsefulConceptsKotlinKt.divideByZero();
    }
}


