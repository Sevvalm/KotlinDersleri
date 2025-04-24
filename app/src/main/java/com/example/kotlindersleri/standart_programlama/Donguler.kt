package com.example.kotlindersleri.standart_programlama

fun main() {
    for(i in 1..3){
        //swift 1..3 , i = dizilerdeki indeks numara
        println("dongu1: $i")
    }
    println(" ")
    //10 ile 20 arasında 5'er artsın
    for(i in 10..20 step 5){
        println("dongu2: $i")
    }
println(" ")

    //20 ile 10 arasında 5'er azalsin
    for(i in 20 downTo 10 step 5){
        println("dongu3: $i")
    }
    println(" ")

    // 1,2,3 yazdir
    var sayac = 1
    while(sayac <4){
        println("sayi : $sayac")
        sayac +=1 //sayac = sayac+1
        if(sayac >=4){
            println("dongu4 bitti")
        }
    }

    println(" ")

    //break-continue
    for(i in 1..5){
        if(i==3){
            break //donguyu durdurur
        }
        println("dongu5 : $i") //1,2
    }

    println(" ")

    for(i in 1..5){
        if(i==3){
            continue //bulundugu adımı pas gecer
        }
        println("dongu6 : $i") //1,2,4,5
    }
}