package com.example.kotlindersleri.oop.kalitim

fun main() {
    val hayvan = Hayvan()
    val memeli = Memeli()
    val kedi = Kedi()
    val kopek = Kopek()

    hayvan.sesCikar() //kalitim yok, kendi metoduna eristi
    memeli.sesCikar() //kalitim var, bir ust sinifin metoduna eristi
    kedi.sesCikar() //kalitim var, kendi metoduna eristi, ust siniftaki metoda ek ozellik eklenebilir
    kopek.sesCikar() //kalitim var, kendi metoduna eristi, ust siniftaki metoda ek ozellik eklenebilir


}