package com.example.kotlindersleri.collections

fun main() {

    //tanımlama
    val meyveler = ArrayList<String>()

    //veri ekleme (add-> sonuna ekler)
    meyveler.add("Elma") //0. index
    meyveler.add("Muz") //1. index
    meyveler.add("Kiraz") //2.index
    println(meyveler) //[Elma, Muz, Kiraz]

    //guncelleme
    meyveler[1]= "Portakal"
    println(meyveler) //[Elma, Portakal, Kiraz]

    //Insert : istediğimiz bir indexe ekleme
    meyveler.add(1,"Kivi")
    println(meyveler) //[Elma, Kivi, Portakal, Kiraz]

    //okuma
    println(meyveler.get(3)) //Kiraz
    println(meyveler[3]) //Kiraz

    println("Boyut : ${meyveler.size}") //Boyut : 4

    //ters cevir
    meyveler.reverse()
    println(meyveler) //[Kiraz, Portakal, Kivi, Elma]

    for(i in meyveler){
        println("Sonuc : $i")
//        Sonuc : Kiraz
//        Sonuc : Portakal
//        Sonuc : Kivi
//        Sonuc : Elma
    }

    for ((index,meyve) in meyveler.withIndex()){ //Swift -> enumarated()
        println("$index. -> $meyve")
    // 0. -> Kiraz
    // 1. -> Portakal
    // 2. -> Kivi
    // 3. -> Elma
    }

    meyveler.removeAt(1)
    println(meyveler) // [Kiraz, Kivi, Elma]

    meyveler.clear()
    println(meyveler) // [] -> array icindeki her seyi temizler


}