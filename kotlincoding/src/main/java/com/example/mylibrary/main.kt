package com.example.mylibrary

fun main(args: Array<String>) {
    println("Hello, world!")

    val firstValue = 5;
    print(firstValue);

    val mutableList = mutableListOf("test","election");
    print(mutableList);
    mutableList.removeAt(1);
    print(mutableList);

    val test :String? = null;

    print(test?:"o");
}