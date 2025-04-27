package com.example.kotlindersleri.oop

fun main() {
    //Nullable, Null Safety, Optional(Swift)
    //genellikle mobil uygulama gelistirme dillerinde yer almaktadir
    //null,Nan,nil

    //1. Tanımlama
    var mesaj : String? = null
    mesaj ="merhaba"

    //*****Kullanim yontemleri******

    //Yontem 1
    //sorun yoksa calisir - sorun varsa uygulama cokmez
    println("Yontem 1 : ${mesaj?.uppercase()}")

    //Yontem 2
    //sorun yoksa calisir - sorun varsa uygulama coker
    //cok emin olunan konularda kullanilabilir
    println("Yontem 2 : ${mesaj!!.uppercase()}")


    //Yontem 3
    //null kontrolu 1
    if(mesaj!=null){
        println("Yontem 3 : ${mesaj.uppercase()}")
    }else{
        println("Yontem 3 : degiskende null yer almaktadir")
    }

    //null kontrolu 2
    mesaj?.let {
        println("Yontem 3 : ${mesaj.uppercase()}")
    }
}