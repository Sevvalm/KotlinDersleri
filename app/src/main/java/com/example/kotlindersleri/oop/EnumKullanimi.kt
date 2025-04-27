package com.example.kotlindersleri.oop

fun main() {
    ucretHesapla(KonserveBoyut.ORTA,55)
}


fun ucretHesapla(boyut: KonserveBoyut,adet: Int){
    when(boyut){
        KonserveBoyut.KUCUK -> println("ucret: ${adet*104} TL")
        KonserveBoyut.ORTA -> println("ucret: ${adet*207} TL")
        KonserveBoyut.BUYUK -> println("ucret: ${adet*309} TL")
    }
}