package com.example.kotlindersleri.oop

fun main() {
    //nesne olusturma

    //Yemekler sinifinda var oldugu icin degerler degistirme isleşmi yapabiliriz
    // FAKAT y1 = y2 yapamayız cunku asagida val olarak yazdik

    val y1 =Yemekler(100,"kofte",240)
    //deger okuma
    y1.bilgiAl()

    val y2 = Yemekler(200,"baklava",300)
    //deger okuma
    y2.bilgiAl()

    //deger atama/degistirme
    y1.fiyat = 350
    y1.bilgiAl()

}