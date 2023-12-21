package org.example
import java.util.Scanner
val scanner = Scanner(System.`in`)
fun llegirModel(): Int {
    println("Selecciona el model:")
    println("1. Volkswagen Grand California: model bàsic.")
    println("2. Volkswagen Grand California: model Camper Full Equip.")
    return scanner.nextInt()
}

fun llegirAnys(): Int {
    println("Quants anys te el model?")
    return scanner.nextInt()
}

fun llegirKmPneumatics(): Long {
    println("Quants kilòmetres tenen els teus pneumàtics?")
    return scanner.nextLong()
}

fun llegirPortabicis(): Boolean {
    println("Disposa de portabicis? Si us plau, responeu 'true' en cas afirmatiu o 'false' en cas negatiu.")
    return scanner.nextBoolean()
}