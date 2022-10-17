package com.example.uzcryilltolatin.utils

/**
 * Created by Erkinjon on 8/9/2022.
 */

class toLatin {

    fun convertUZ(cyr: String): String {

        var lat: String

        lat = cyr.replace("я".toRegex(), "ya")
        lat = lat.replace("ш".toRegex(), "sh")
        lat = lat.replace("ч".toRegex(), "ch")
        lat = lat.replace("ю".toRegex(), "yu")
        lat = lat.replace("ё".toRegex(),"yo")
        lat = lat.replace("ў".toRegex(), "o'")
        lat = lat.replace("ғ".toRegex(), "g'")
        lat = lat.replace("а".toRegex(), "a")
        lat = lat.replace("б".toRegex(), "b")
        lat = lat.replace("д".toRegex(), "d")
        lat = lat.replace("ф".toRegex(), "f")
        lat = lat.replace("г".toRegex(), "g")
        lat = lat.replace("и".toRegex(), "i")
        lat = lat.replace("ж".toRegex(), "j")
        lat = lat.replace("к".toRegex(), "k")
        lat = lat.replace("л".toRegex(), "l")
        lat = lat.replace("м".toRegex(), "m")
        lat = lat.replace("н".toRegex(), "n")
        lat = lat.replace("о".toRegex(), "o")
        lat = lat.replace("п".toRegex(), "p")
        lat = lat.replace("қ".toRegex(), "q")
        lat = lat.replace("р".toRegex(), "r")
        lat = lat.replace("с".toRegex(),"s")
        lat = lat.replace("т".toRegex(), "t")
        lat = lat.replace("у".toRegex(), "u")
        lat = lat.replace("в".toRegex(), "v")
        lat = lat.replace("х".toRegex(), "x")
        lat = lat.replace("й".toRegex(), "y")
        lat = lat.replace("з".toRegex(), "z")
        lat = lat.replace("ъ".toRegex(), "'")
        lat = lat.replace("ь".toRegex(), "'")
        lat = lat.replace("ҳ".toRegex(), "h")
        if (lat.subSequence(0,1)=="e"){
            lat = lat.replace("e".toRegex(),"ye")
        }else{
            lat = lat.replace("e".toRegex(), "e")
        }


        lat = lat.replace("Я".toRegex(), "YA")
        lat = lat.replace("Я".toRegex(), "Ya")
        lat = lat.replace("Ш".toRegex(), "SH")
        lat = lat.replace("Ш".toRegex(), "Sh")
        lat = lat.replace("Ч".toRegex(), "CH")
        lat = lat.replace("Ч".toRegex(), "Ch")
        lat = lat.replace("Ю".toRegex(), "YU")
        lat = lat.replace("Ю".toRegex(), "Yu")
        lat = lat.replace("Ë".toRegex(),"YO")
        lat = lat.replace("Ë".toRegex(), "Yo")
        lat = lat.replace("Ў".toRegex(), "O'")
        lat = lat.replace("Ғ".toRegex(), "G'")
        lat = lat.replace("A".toRegex(), "А")
        lat = lat.replace("Б".toRegex(), "B")
        lat = lat.replace("Д".toRegex(), "D")
        lat = lat.replace("Ф".toRegex(), "F")
        lat = lat.replace("Г".toRegex(), "G")
        lat = lat.replace("И".toRegex(), "I")
        lat = lat.replace("Ж".toRegex(), "J")
        lat = lat.replace("K".toRegex(), "К")
        lat = lat.replace("Л".toRegex(), "L")
        lat = lat.replace("M".toRegex(), "М")
        lat = lat.replace("Н".toRegex(), "N")
        lat = lat.replace("O".toRegex(), "О")
        lat = lat.replace("П".toRegex(), "P")
        lat = lat.replace("Қ".toRegex(), "Q")
        lat = lat.replace("Р".toRegex(), "R")
        lat = lat.replace("С".toRegex(),"S")
        lat = lat.replace("T".toRegex(), "Т")
        lat = lat.replace("У".toRegex(), "U")
        lat = lat.replace("В".toRegex(), "V")
        lat = lat.replace("X".toRegex(), "Х")
        lat = lat.replace("Й".toRegex(), "Y")
        lat = lat.replace("З".toRegex(), "Z")
        lat = lat.replace("Ъ".toRegex(), "'")
        lat = lat.replace("ь".toRegex(), "'")
        lat = lat.replace("Ҳ".toRegex(), "H")
        if (lat.subSequence(0,1)=="E"){
            lat = lat.replace("E".toRegex(),"Ye")
            lat = lat.replace("E".toRegex(),"YE")
        }else{
            lat = lat.replace("E".toRegex(), "Е")
        }


        return lat
    }
}
