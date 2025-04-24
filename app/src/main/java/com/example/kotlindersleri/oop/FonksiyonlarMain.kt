package com.example.kotlindersleri.oop

fun main() {
    val f = Fonksiyonlar()

    //void = Unit
    f.selamla1()

    //return
    val gelenSonuc = f.selamla2()
    println("gelenSonuc: $gelenSonuc")

    //parametre alan fonks.
    f.selamla3("sevval","fonksiyon calisti")

    var sa = f.topla(5,10,"sevval")
//    println("gelenSonuc2: $sa")

}