package com.example.kotlindersleri.oop

fun main() {
    //val sonuc = 5.carp(2)
    val sonuc = 5 carp 2
    println(sonuc) //10 (this:5 - sayi:2)
}

infix fun Int.carp(sayi:Int): Int{
    //int classına carp fonksiyonu eklendi
    return this * sayi //this int classını temsil ediyor
}
//infix ekleyince dongulerde yazdigimiz gibi for(i in 20 downTo 10 step 5) 10 step 5 gibi yazabilmemizi saglar
//val sonuc = 5.carp(2) bu sekilde de yazilabilir
