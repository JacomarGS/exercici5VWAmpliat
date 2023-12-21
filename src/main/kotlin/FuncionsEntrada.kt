package org.example

fun llegirModel(): Int {
    println("Selecciona el model:")
    println("1. Volkswagen Grand California: model bàsic.")
    println("2. Volkswagen Grand California: model Camper Full Equip.")
    return readlnOrNull()?.toInt() ?: 0
}

fun llegirAnys(): Int {
    println("Quants anys te el model?")
    return readlnOrNull()?.toInt() ?: 0
}

fun llegirKmPneumatics(): Long {
    println("Quants kilòmetres tenen els teus pneumàtics?")
    return readlnOrNull()?.toLong() ?: 0
}

fun llegirPortabicis(): Boolean {
    println("Disposa de portabicis? Si us plau, responeu 'true' en cas afirmatiu o 'false' en cas negatiu.")
    return readlnOrNull().toBoolean()
}