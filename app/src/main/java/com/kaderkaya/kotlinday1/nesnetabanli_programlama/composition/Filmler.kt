package com.kaderkaya.kotlinday1.nesnetabanli_programlama.composition

data class Filmler(val film_id:Int,
                   var film_adı:String,
                   var film_yil:Int,
                   var kategori:Kategoriler,
                   var  yönetmen:Yönetmenler) {
}