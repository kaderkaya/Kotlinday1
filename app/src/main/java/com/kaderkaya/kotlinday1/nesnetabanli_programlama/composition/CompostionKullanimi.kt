package com.kaderkaya.kotlinday1.nesnetabanli_programlama.composition

fun main() {
    val k1 = Kategoriler(1,"Dram")
    val k2 = Kategoriler(2,"Bilim Kurgu")

    val y1 = Yönetmenler(1,"Quentin Tarantino")
    val y2 = Yönetmenler(2,"Christopher Nolan")

    val f1 = Filmler(1,"Django",2013,k1,y1)
}