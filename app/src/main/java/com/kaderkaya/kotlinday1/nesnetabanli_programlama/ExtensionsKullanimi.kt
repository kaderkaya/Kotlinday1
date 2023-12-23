package com.kaderkaya.kotlinday1.nesnetabanli_programlama

fun main() {
    val sonuc = 5.carpi(2)
    println("Gelen Sonuç : $sonuc")


}
fun Int.carpi(sayi:Int) : Int {
    return this * sayi// this- Int sınıfı

}