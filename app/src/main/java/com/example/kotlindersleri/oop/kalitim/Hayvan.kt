package com.example.kotlindersleri.oop.kalitim
//open ozellik aktaracagi anlamina geliyor

//override kalitim iliskisi ve interface iliskisinde kullanilir!!
open class Hayvan {

    //kalitimda fonks kullanmak icin open yazmamiz lazim
    open fun sesCikar(){
        println("Ses cikar")
    }
}