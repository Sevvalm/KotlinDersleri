package com.example.kotlindersleri

fun main() {
    // 2 tur hata vardir
    //1.Compile Error : Kodlama yaparken olusur

    val sayi = 100
    //sayi = 500  burada hata verir cunku sayi val turunde constant yani


    //2.Runtime Error (Exceptions)
    val x = 10
    val y = 0 //sifira bolme hatasi alindi

    try {
        println("Sonuc : ${x/y}")
        println("islem tamamlandi")

    }catch (e: Exception){
        println("ikinci sayi sifir olamaz 1 : $e") // ikinci sayi sifir olamaz : java.lang.ArithmeticException: / by zero
        println("ikinci sayi sifir olamaz 2 : ${e.message}") // ikinci sayi sifir olamaz : / by zero
    }
    // catch (e: ArithmeticException){
    //     println(e)
    // }
    // catch (e: NullPointerException){
    //     println(e)
    // }
}