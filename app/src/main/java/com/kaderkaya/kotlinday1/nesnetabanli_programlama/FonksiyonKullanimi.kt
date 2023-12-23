package com.kaderkaya.kotlinday1.nesnetabanli_programlama

fun main() {
    val f = Fonkisyonlar()
    f.selamla1()

   val gelenSonuc = f.selamla2()
    println("Gelen Sonuç :$gelenSonuc")
    f.selamla3("Zeynep")
    val gelenToplam = f.toplama(10,20)
    println("Gelen toplam : $gelenToplam")
}