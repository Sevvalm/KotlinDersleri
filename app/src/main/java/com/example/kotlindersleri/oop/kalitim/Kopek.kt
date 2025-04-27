package com.example.kotlindersleri.oop.kalitim

//superclass -> Memeli
//subclass -> Kopek
//Kopek -> Memeli -> Hayvan
class Kopek : Memeli() {
    override fun sesCikar() {
        //super.sesCikar() -> super : kalitim ile ust sinifi(memeli) temsil eder
        println("hav hav")
    }
}