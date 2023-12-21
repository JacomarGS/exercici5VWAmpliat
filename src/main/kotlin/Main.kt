package org.example

fun main() {
    println("Benvingut al programa de càlcul del valor de mercat de la Volkswagen Grand California")
    val model = llegirModel()
    val kmPneumaticos = llegirKmPneumatics()
    val anys = llegirAnys()
    val portabicis = llegirPortabicis()
    val preuBase = calcularPreuBase(model)
    val preuActual = calcularPreuActual(preuBase, kmPneumaticos, anys, portabicis)
    println("Preu base del seu Volkswagen Grand Califòrnia: $preuBase €")
    println("Preu actual del seu Volkswagen Grand Califòrnia: $preuActual €")
}