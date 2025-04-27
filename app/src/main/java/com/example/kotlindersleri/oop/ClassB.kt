package com.example.kotlindersleri.oop

class ClassB : MyInterface{
    override var degisken: Int = 100

    override fun method1() {
        println("Metod 1 calisti")
    }

    override fun method2(): String {
        return "Metod 2 calisti"
    }

}