package com.example.kotlindersleri.Odevler


fun main() {
    var odev2 = Odev2()

    println("25 derece fahrenheit: ${odev2.convertFahrenheit(25.0)}")
    println("Kenarlari 4 ve 15 olan dikdörtgenin cevresi: ${odev2.dikdortgenCevre(4.0, 15.0)}")
    println("6 sayisinin faktoriyeli: ${odev2.faktoriyel(6)}")
    println("Kelime icinde kac tane 'a' harfi var: ${odev2.aHarfiSayisi("Ankara")}")

    println("5 kenarli cokgenin ic acilari toplami: ${odev2.icAciToplami(5)}")
    println("20 gun icin alinacak maas: ${odev2.maasHesapla(20)} TL")
    println("45 GB internet ucreti: ${odev2.kotaUcretiHesapla(85)} TL")

}
