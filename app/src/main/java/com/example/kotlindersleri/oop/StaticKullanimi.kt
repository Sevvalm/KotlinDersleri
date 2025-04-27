package com.example.kotlindersleri.oop

fun main() {
    val a = ClassA()

    //standart nesne tabanli erisim  1 nesne üzerinden islemler yapiliyor
//    println(a.x)
//    a.method()
    
    
    //Sanal nesne - virtual object - nameless object
//    println(ClassA().x) //1.nesne
//    ClassA().method() //2.nesne

    //Static kullanimi
    println(ClassA.x)
    ClassA.method()
}