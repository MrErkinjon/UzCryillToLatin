package com.example.uzcryilltolatin.utils


/**
 * Created by Erkinjon on 8/9/2022.
 */

class toCyrillic {

    fun convertToCyrUZ(lat: String): String {
        var cyr = lat.replace("ya".toRegex(), "я")
        cyr = cyr.replace("sh".toRegex(), "ш")
        cyr = cyr.replace("ch".toRegex(), "ч")
        cyr = cyr.replace("yu".toRegex(), "ю")
        cyr = cyr.replace("ye".toRegex(), "е")
        cyr = cyr.replace("yo".toRegex(), "ё")
        cyr = cyr.replace("ks".toRegex(), "x")
        cyr = cyr.replace("ts".toRegex(), "ц")
        cyr = cyr.replace("o'".toRegex(), "ў")
        cyr = cyr.replace("g'".toRegex(), "ғ")
        cyr = cyr.replace("'".toRegex(), "Ъ")
        cyr = cyr.replace("a".toRegex(), "а")
        cyr = cyr.replace("b".toRegex(), "б")
        cyr = cyr.replace("d".toRegex(), "д")
        cyr = cyr.replace("f".toRegex(), "ф")
        cyr = cyr.replace("g".toRegex(), "г")
        cyr = cyr.replace("i".toRegex(), "и")
        cyr = cyr.replace("j".toRegex(), "ж")
        cyr = cyr.replace("k".toRegex(), "к")
        cyr = cyr.replace("l".toRegex(), "л")
        cyr = cyr.replace("m".toRegex(), "м")
        cyr = cyr.replace("n".toRegex(), "н")
        cyr = cyr.replace("o".toRegex(), "о")
        cyr = cyr.replace("p".toRegex(), "п")
        cyr = cyr.replace("q".toRegex(), "қ")
        cyr = cyr.replace("r".toRegex(), "р")
        cyr = cyr.replace("s".toRegex(), "с")
        cyr = cyr.replace("t".toRegex(), "т")
        cyr = cyr.replace("u".toRegex(), "у")
        cyr = cyr.replace("v".toRegex(), "в")
        cyr = cyr.replace("x".toRegex(), "х")
        cyr = cyr.replace("y".toRegex(), "й")
        cyr = cyr.replace("z".toRegex(), "з")
        if (lat.subSequence(0,1)=="e"){
            cyr = cyr.replace("e".toRegex(),"э")
        }else{
            cyr = cyr.replace("e".toRegex(), "e")
        }
        cyr = cyr.replace("h".toRegex(), "ҳ")

        lat.replace("YA".toRegex(), "Я")
        cyr = cyr.replace("Ya".toRegex(), "Я")
        cyr = cyr.replace("SH".toRegex(), "Ш")
        cyr = cyr.replace("Sh".toRegex(), "Ш")
        cyr = cyr.replace("CH".toRegex(), "Ч")
        cyr = cyr.replace("Ch".toRegex(), "Ч")
        cyr = cyr.replace("YU".toRegex(), "Ю")
        cyr = cyr.replace("Yu".toRegex(), "Ю")
        cyr = cyr.replace("YE".toRegex(), "Е")
        cyr = cyr.replace("Ye".toRegex(), "Е")
        cyr = cyr.replace("Ks".toRegex(), "Х")
        cyr = cyr.replace("KS".toRegex(), "Х")
        cyr = cyr.replace("YO".toRegex(), "Ë")
        cyr = cyr.replace("Yo".toRegex(), "Ë")
        cyr = cyr.replace("O'".toRegex(), "Ў")
        cyr = cyr.replace("G'".toRegex(), "Ғ")
        cyr = cyr.replace("A".toRegex(), "А")
        cyr = cyr.replace("B".toRegex(), "Б")
        cyr = cyr.replace("D".toRegex(), "Д")
        cyr = cyr.replace("F".toRegex(), "Ф")
        cyr = cyr.replace("G".toRegex(), "Г")
        cyr = cyr.replace("I".toRegex(), "И")
        cyr = cyr.replace("J".toRegex(), "Ж")
        cyr = cyr.replace("K".toRegex(), "К")
        cyr = cyr.replace("L".toRegex(), "Л")
        cyr = cyr.replace("M".toRegex(), "М")
        cyr = cyr.replace("N".toRegex(), "Н")
        cyr = cyr.replace("O".toRegex(), "О")
        cyr = cyr.replace("P".toRegex(), "П")
        cyr = cyr.replace("Q".toRegex(), "Қ")
        cyr = cyr.replace("R".toRegex(), "Р")
        cyr = cyr.replace("S".toRegex(), "С")
        cyr = cyr.replace("T".toRegex(), "Т")
        cyr = cyr.replace("U".toRegex(), "У")
        cyr = cyr.replace("V".toRegex(), "В")
        cyr = cyr.replace("X".toRegex(), "Х")
        cyr = cyr.replace("Y".toRegex(), "Й")
        cyr = cyr.replace("Z".toRegex(), "З")
        cyr = cyr.replace("'".toRegex(), "Ъ")
        cyr = cyr.replace("H".toRegex(), "Ҳ")
        if (lat.subSequence(0,1)=="E"){
            cyr = cyr.replace("E".toRegex(),"Э")
        }else{
            cyr = cyr.replace("E".toRegex(), "Е")
        }


        return cyr
    }
}
