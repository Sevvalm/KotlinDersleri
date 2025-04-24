package com.example.kotlindersleri.degiskenler

fun main() {
    var id =1
    var name="Mont"
    var image = "imageSource"
    var rating= 4.7
    var price= 4500
    var stock= true

    println("Id: $id")
    println("Name: $name")
    println("Image: $image")
    println("Rating: $rating")
    println("Price: $price")
    println("Stock: $stock")

//Sabitler-Constants
    var sayi= 30

    val num=50
    //val num değiskeninin degistirlemeyecegini sabit bir deger oldgunu soyler
    //constant degisken olusturur

    //*****Tur donusumu*****
    //1- Sayısaldan sayısala donusumu
    val d = 89.59
    val sonuc1 = d.toInt()
    val sonuc2 = d.toDouble()
    println(sonuc1)
    println(sonuc2)

    //2-Sayisaldan stringe donusum
    var s="Hello"
    val asas=56 //"56"
    val newAsas = asas.toString()
    println(s+" "+newAsas)

    //3-Metinden sayisasala donusum
    val yazi="48"
    val nYazi= yazi.toInt()

    println(nYazi)
//string ifade içinde harf gelme durumu varsa .toIntOrNull() secilmeli uygulamanın cokmemesi icin
    val word= "5T"
    val newWord= word.toIntOrNull()
    //newWord yazdırıldıgında null doner


}
