package com.example.kotlindersleri.collections

fun main() {
    val f1 = Filmler(1,"Babam ve Oglum",50)
    val f2 = Filmler(2,"Neseli Hayatlar",30)
    val f3 = Filmler(3,"Kis Uykusu",80)


    val filmlerListesi = ArrayList<Filmler>()
    filmlerListesi.add(f1)
    filmlerListesi.add(f2)
    filmlerListesi.add(f3)

    for(film in filmlerListesi){
        println("${film.id} : ${film.ad} , ${film.fiyat} TL")
    }
//it array icindeki elemanlari temsil ediyor
    //Sıralama - sorting
    println("---Fiyata gore Artan---")
    //Ascend - ASC
    val siralama1 = filmlerListesi.sortedWith(compareBy { it.fiyat }) // kucukten buyuge
    for(film in siralama1){
        println("${film.id} : ${film.ad} , ${film.fiyat} TL")
    }

    println("---Fiyata gore Azalan---")
    //DESC
    val siralama2 = filmlerListesi.sortedWith(compareByDescending { it.fiyat }) // buyukten kucuge
    for(film in siralama2){
        println("${film.id} : ${film.ad} , ${film.fiyat} TL")
    }

    println("---Isme gore Siralama---")
    val siralama3 = filmlerListesi.sortedWith(compareBy { it.ad }) // alfabetik siralama
    for(film in siralama3){
        println("${film.id} : ${film.ad} , ${film.fiyat} TL")
    }


    //Filtreleme
    println("----Filtreleme 1----")
    //predicate = sorgu
    val filtreleme1 = filmlerListesi.filter { it.fiyat > 40 && it.fiyat <60 } //icine kosul belirtmemiz gerek
    for(film in filtreleme1){
        println("${film.id} : ${film.ad} , ${film.fiyat} TL") //1 : Babam ve Oglum , 50 TL
    }


    println("----Filtreleme 2----")
    //predicate = sorgu
    val filtreleme2 = filmlerListesi.filter { it.ad.contains("a") } //icinde a harfi olanlari geitirir
    for(film in filtreleme2){
        println("${film.id} : ${film.ad} , ${film.fiyat} TL")
        // 1 : Babam ve Oglum , 50 TL
        // 2 : Neseli Hayatlar , 30 TL

    }

}