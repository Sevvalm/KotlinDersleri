package com.example.kotlindersleri.collections

fun main() {
    //HASHSET

    //Tanimlama
    val meyveler = HashSet<String>()
    //Any -> en ust sinif demek : Butun turleri kapsar (java'da object sinifi)

    meyveler.add("Elma")
    meyveler.add("Muz")
    meyveler.add("Kiraz")
    println(meyveler) //rastgele siralama yapip yazar -> [Muz, Elma, Kiraz] gibi

    meyveler.add("Elma")
    println(meyveler) //[Muz, Elma, Kiraz] ayni seyleri eklemez

    println("Boyut : ${meyveler.size}") // Bouyt : 3

    val y = meyveler.elementAt(2)
    println(y) // Kiraz

    for(i in meyveler){
        println("Sonuc : $i")
        //Sonuc : Muz
        //Sonuc : Elma
        //Sonuc : Kiraz
    }

    for ((index,meyve) in meyveler.withIndex()) { //Swift -> enumarated()
        println("$index. -> $meyve")
        // 0. -> Muz
        // 1. -> Elma
        // 2. -> Kiraz

    }

    meyveler.remove("Kiraz")
    println(meyveler) //[Muz, Elma]

    meyveler.clear()
    println(meyveler) //[]



}