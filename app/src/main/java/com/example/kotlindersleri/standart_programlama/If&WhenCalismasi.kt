package com.example.kotlindersleri.standart_programlama

fun main() {
    val yas = 19

    if(yas>=18){
        println("resitsiniz")
    }else{
        println("resit degil!")
    }

    val userName= "sevVal"
    val password = 1234

    if(userName =="sevval"&& password==1234){
        println("ho")
    }else{
        println("giris basarisiz!")
    }
// && : ve , || : ya da


    //when -> switch
    val number = 3
    when(number){
        1->println("sayi 1")
        2->println("sayi 2")
        else -> println("tanimlanmayan sayi")
    }

}