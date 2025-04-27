package com.example.kotlindersleri.collections

fun main() {
    // HASHMAP Json veri modeline benzemektedir (key/value iliskisi var)
    //Map, Dictionary(Swift)
    //Shared Preferences, DataStore, UserDefault(Swift) benziyor

    //farkli keylere ayni degerler atanabilir
    val iller = HashMap<Int, String>()
    iller.put(16,"Bursa")
    iller.put(34,"Istanbul")
    iller.put(6,"Ankara")
    println(iller) //{16=Bursa, 34=Istanbul, 6=Ankara}


    //guncelleme
    iller[16] = "Yeni Bursa"
    println(iller) //{16=Yeni Bursa, 34=Istanbul, 6=Ankara}

    val il = iller[6]
    println(il) //Ankara
    println("Boyut : ${iller.size}") // Boyut : 3

    //okuma
    for((anahtar,deger) in iller){
        println("$anahtar -> $deger")
        // 16 -> Yeni Bursa
        // 34 -> Istanbul
        //  6 -> Ankara
    }

    //silme islemi
    iller.remove(34) // key ile silme islemi yapilir
    println(iller) // {16=Yeni Bursa, 6=Ankara}

    iller.clear()
    println(iller) // {}
}