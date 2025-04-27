package com.example.kotlindersleri.oop
//Swift diline protocol

//classB' de kullanimi var
interface MyInterface {
    //interface icinde taslak caismalar yer alir yani null kurallari gecerli degil
    //ilk deger atamasina gerek yok
    var degisken:Int

    fun method1()

    fun method2(): String
}