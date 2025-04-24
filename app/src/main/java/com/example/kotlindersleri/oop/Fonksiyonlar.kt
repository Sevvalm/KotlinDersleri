package com.example.kotlindersleri.oop

class Fonksiyonlar {
    //void - sadece islem yapar geri donus tipi yoktur

    fun selamla1(){
        val sonuc = "merhaba Sevval1"
        println(sonuc)
    }

    //return - hem islem yapan hem veri transferi yapan
    fun selamla2() : String{
        val sonuc2 = "merhaba Sevval2"
        return sonuc2
    }


    //parametre alan fonksiyonlar
    fun selamla3(isim:String,mesaj:String){
        val sonuc = "merhaba $isim, $mesaj"
        println(sonuc)
    }


    //overloading
    //bir sinif icindeli ayni fonksşyonlarş r-tekrar tekrar farkli islevlerle kullanmak
    fun topla(sayi1:Int,sayi2:Int){
        println(sayi1+sayi2)
    }

    fun topla(sayi1:Double,sayi2:Double){
        println(sayi1+sayi2)
    }

    fun topla(sayi1:Int,sayi2:Int,isim:String){
         println("Toplam : ${sayi1+sayi2} islem yapan $isim")
    }

    fun oner(sa:Int, ede : Int) {

    }
}