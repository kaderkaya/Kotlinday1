package com.kaderkaya.kotlinday1.nesnetabanli_programlama

fun main() {
    var x = "Merhaba"
    var str:String? = null
    // yöntem1
    println("yöntem1 : ${str?.trim()}")

    // yöntem2
   // println("yöntem2 : ${str!!.trim()}")

    // yöntem3
    if (str != null){
        println("yöntem3 : ${str.trim()}")
    }else{
        println("Sonuç nulldur")
    }

    // yöntem4
    str?.let {
        println("yöntem4 : ${it.trim()}")
    }

}