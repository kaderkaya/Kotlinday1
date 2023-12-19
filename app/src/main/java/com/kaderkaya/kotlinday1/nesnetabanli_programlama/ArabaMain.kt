package com.kaderkaya.kotlinday1.nesnetabanli_programlama

fun main() {
    //Nesne oluşturma

    val bmw = Araba("kırmızı",0,false)
    // okuma
   bmw.bilgiAl()
    // veri atama
    bmw.renk = "Mavi"
    bmw.hiz = 10
    bmw.calisiyorMu = true
    println("Renk : ${bmw.renk}")
    println("Hız : ${bmw.hiz}")
    println("çalışıyor mu : ${bmw.calisiyorMu}")




    val sahin = Araba("beyaz",100,true)

    println("Renk : ${sahin.renk}")
    println("Hız : ${sahin.hiz}")
    println("çalışıyor mu : ${sahin.calisiyorMu}")
}