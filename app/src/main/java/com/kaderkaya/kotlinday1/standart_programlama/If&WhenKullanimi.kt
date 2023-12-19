package com.kaderkaya.kotlinday1.standart_programlama

fun main() {
    val yas = 17
    val isim = "Ahmet"

    if (yas >=18){ // Swift : if yas>=18{ }
        println("Reşitsiniz")

    }else{
        println("reşit değilisiniz")
    }

    if (isim == "Ahmet"){
        println("merhaba ahmet")

    } else{
        println("Tanınmayan kişi")
    }

    val ka = "admin"
    val s = 123456

    if (ka == "admin" && s == 123456){

    } else{
        println("hatalı giris")
    }

    //When : Switch
    val gun =3

    when (gun){
        1 -> println("pazartesi")
        else -> println("Böyle bir gün yok")

    }
}