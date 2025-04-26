package com.example.kotlindersleri.Odevler

//Celcius'tan fahrenheit'a
fun convertFahrenheit(celcius: Double): Double{
        return (celcius*1.8)+32
}

//Dikdörtgenin çevresini hesaplama
fun dikdortgenCevre(uzunKenar: Double, kisaKenar: Double): Double {
    return 2 * (uzunKenar + kisaKenar)
}

//Faktöriyel hesaplama
fun faktoriyel(sayi: Int): Long {
    var sonuc : Long= 1
    for (i in 1..sayi) {
        sonuc *= i
    }
    return sonuc
}

//Kelime içinde kaç adet 'a' harfi olduğunu bulma
fun aHarfiSayisi(kelime: String): Int {
    return kelime.count { it == 'a' || it == 'A' }
}

//ic aci toplami
fun icAciToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

//maas hesaplama
fun maasHesapla(gunSayisi: Int): Int {
    val calismaSaati = gunSayisi * 8
    val normalSaatUcreti = 10
    val mesaiSaatUcreti = 20

    return if (calismaSaati <= 160) {
       calismaSaati * normalSaatUcreti

     } else {
        val mesaiSaati = calismaSaati - 160
        (160 * normalSaatUcreti) + (mesaiSaati * mesaiSaatUcreti)
    }
}

//kota ucreti hesaplama
fun kotaUcretiHesapla(kota: Int): Int {
    val sabitUcret = 100
    val kotaSiniri = 50
    val asimUcreti = 4

    return if (kota <= kotaSiniri) {
        sabitUcret
    } else {
        val asimMiktari = kota - kotaSiniri
        sabitUcret + (asimMiktari * asimUcreti)
    }
}

fun main() {
    println("25 derece fahrenheit: ${convertFahrenheit(25.0)}")
    println("Kenarlari 4 ve 15 olan dikdörtgenin cevresi: ${dikdortgenCevre(4.0, 15.0)}")
    println("6 sayisinin faktoriyeli: ${faktoriyel(6)}")
    println("Kelime icinde kaç tane 'a' harfi var: ${aHarfiSayisi("Ankara")}")

    println("5 kenarli cokgenin ic aciları toplami: ${icAciToplami(5)}")
    println("20 gun icin alinacak maas: ${maasHesapla(20)} TL")
    println("45 GB internet ucreti: ${kotaUcretiHesapla(85)} TL")
}
