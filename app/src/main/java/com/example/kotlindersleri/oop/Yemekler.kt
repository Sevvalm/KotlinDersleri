package com.example.kotlindersleri.oop

class Yemekler (var id:Int,var ad:String,var fiyat:Int) {
//constructor-init methodu/fonksiyonu
    // (aslında class'ta () yazdigimiz (var id:Int,var ad:String,var fiyat:Int) bu construcotr oluyor zaten

    //bu siniftan nesne olustugunda calismasini istedigmiz bir sey varsa kullanabiliriz

    init{
        println("***nesne olustu***")
    }

    fun bilgiAl(){
        println("---------")
        println("Id: ${id}")
        println("Ad: ${ad}")
        println("Fiyat: ${fiyat}")
    }



//this: bulundugu sinifi temsil eder
    //println("---------")
    //    println("Id: ${this.id}")
    //    println("Ad: ${this.ad}")
    //    println("Fiyat: ${this.fiyat}")


    //super: kalitim ile bir ust sinifi temsil eder
}