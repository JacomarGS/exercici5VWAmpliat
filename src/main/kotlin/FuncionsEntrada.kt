package org.example

fun llegirModel(): String {
    println("Quin model tens? (normal / camper full equip)")
    return readLine()?.toLowerCase() ?: ""
}

fun llegirKmNeumaticos(): Long {
    println("Quants kilòmetres tenen els teus pneumàtics?")
    return readLine()?.toLong() ?: 0
}