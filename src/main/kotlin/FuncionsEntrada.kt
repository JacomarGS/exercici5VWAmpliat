package org.example

fun llegirModel(): String {
    println("Quin model tens? (normal / camper full equip)")
    return readLine()?.lowercase() ?: ""
}

fun llegirAnys(): Int {
    println("Quants anys te el model")
    return readLine()?.toInt() ?: 0
}

fun llegirKmNeumaticos(): Long {
    println("Quants kilòmetres tenen els teus pneumàtics?")
    return readLine()?.toLong() ?: 0
}

fun llegirPortabicis(): Boolean {
    println("Disposa de portabicis?")
    return readLine().toBoolean()
}