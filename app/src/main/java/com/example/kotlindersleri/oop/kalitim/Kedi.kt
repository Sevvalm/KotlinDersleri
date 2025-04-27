package com.example.kotlindersleri.oop.kalitim

//superclass -> Memeli
//subclass -> Kedi
//Kedi -> Memeli -> Hayvan
class Kedi : Memeli() {
    override fun sesCikar() {
        //super.sesCikar() -> super : kalitim ile ust sinifi(memeli) temsil eder
        println("miyav miyav")
    }
}