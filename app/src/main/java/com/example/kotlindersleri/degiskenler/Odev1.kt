package com.example.kotlindersleri.degiskenler

fun main() {
    var ilce = "Ümraniye"
    var kita = "Asya"
    var faks = "9902282142053"
    var postaKodu = "34764"
    var instaAdresi = "fthynk99"
    var calistiginbolum = "Android Geliştirme"
    var urunMiktari = 300
    var musteriSoyadi = "Yanık"
    var odemeMiktari = 1100
    var dogumTarihi = "04.10.1999"
    var borc = 500
    var medeniHal = "Bekar"
    var videoYorumu = "Güzel içerik. Elinize sağlık :)"
    var odemeSaati = "14.20"
    var eftMiktari = 16000
    var satilanMiktar = 140
    var telefonModeli = "Samsung Galaxy A7 2018"
    var dergiAdi = "Bilim Çocuk"
    var basimTarihi = "21.11.2024"
    var zamMiktari = "%25"
    var daireSayisi = 32
    var enlem = "39°57'49.50\""
    var boylam = "32°52'21.67\""
    var yemekAdi = "Mantı"
    var urunFiyati = 1100
    var sirket = "FMSS Bilişim"
    var videoAdi = "Jetpack Compose Giriş Eğitimi - 1.Bölüm"
    var muzikSuresi = "3:48"
    var mekanPuani = 4.7
    var dosyaAdi = "Odev1.kt"
    var resimFormati = "png"
    var renk = "red"
    var renkKodu = "#FF0000"
    var bilgisayarModeli = "Monster Abra V15.10"
    var ekranBoyutu = "23.8\""
    var kullanimSuresi = "7 Ay"
    var basinc = 14.7
    var etkinlikGunu = "Perşembe"
    var odemeGunu = "05.12.2024"
    var yolculukCikisTarihi = "16.07.2024"
    var mahalleAdi = "Yenimahalle"
    var otobusHatti = "11ST"
    var kullanilanDakika = 23
    var kargoTakipNo = "4336260250634"
    var kuponSuresi = "2 hafta"
    var kuponKodu = "UDEMY202403403"
    var faturaTarihi = "04.12.2024"

    println("Koordinat Bilgileri")
    println(enlem)
    println(boylam) // String içerisinde " kullanımımın doğru olup olmadığını kontrol amacıyla yazdırdım.

    //Type Casting
    val basincStr = basinc.toString()
    val basincInt = basinc.toInt()
    println(basincStr)
    println(basincInt)

    val kargoTakipNo1 = kargoTakipNo.toIntOrNull()
    println(kargoTakipNo1) //null

    println("Ürünün 2025 Yılı Tahmini Fiyatı: ${urunFiyati + 300} TL") //format string
}