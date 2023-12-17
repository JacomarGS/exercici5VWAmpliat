package org.example

fun llegirModel(): String {
    println("Quin model tens? (normal / camper full equip)")
    return readLine()?.lowercase() ?: ""
}

fun llegirKmNeumaticos(): Long {
    println("Quants kilòmetres tenen els teus pneumàtics?")
    return readLine()?.toLong() ?: 0
}