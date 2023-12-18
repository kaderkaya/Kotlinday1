package com.kaderkaya.kotlinday1.degiskenler

fun main() {
    var ogrenciAdi = "Ahmet"
    var ogrenciYas = 23
    var ogrenciBoy = 1.98
    var ogrenciBasharf = "A"
    var ogrenciDevam = true

    println(ogrenciAdi)
    println(ogrenciYas)
    println(ogrenciBoy)
    println(ogrenciBasharf)
    println(ogrenciDevam)

    var urun_id : Int = 3416
    var urun_adi : String = "Macbook pro"
    var urun_adet : Int = 100
    var urun_fiyat : Double = 42999.99
    var urun_tedarikci : String = "Apple"

    println("Ürün id : $urun_id")
    println("Ürün adı : $urun_adi")
    println("Ürün adet: $urun_adet")
    println("Ürün fiyat: $urun_fiyat")
    println("Ürün tedarikçi : $urun_tedarikci")



    var a = 10
    var b = 20
    println("$a * $b : ${ a * b }")

    // Sabitler Constant
    // val(koltin) - let(Swift) - final(java)

    var sayi = 30
    println(sayi)
    sayi = 100
    println(sayi)

    val numara = 40
    println(numara)
    //numara = 80

    // Tür Dönüşümü - type costing

    val i = 42
    val d = 76.95

    // sayısaldan sayısala dönüşüm
    val sonuc1 = i.toDouble()
    val sonuc2 = d.toInt()
    println(sonuc1)
    println(sonuc2)

    // sayısaldan metine dönüşüm

    val sonuc3 = i.toString()
    val sonuc4 = d.toString()
    println(sonuc3)
    println(sonuc4)

    // metinden sayısala dönüşüm

    val yazi = "67.54"
    val sonuc5 = yazi.toDoubleOrNull()
    println(sonuc5)
    if (sonuc5 !=null){
        println()
    }else{
        println("Dönüşüm Hatası oluştu ve sayınızı kontrol ediniz")
    }

    sonuc5?.let {
        println(it)
    }


    
}

