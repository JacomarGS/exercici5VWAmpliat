package org.example

fun main() {
    println("Benvingut al programa de càlcul del valor de mercat de la Volkswagen Grand California")
    val model = llegirModel()
    val kmNeumaticos = llegirKmNeumaticos()
    val preuBase = calcularPreuBase(model)
    val preuActual = calcularPreuActual(preuBase, kmNeumaticos)
    println("Preu base original de la furgo: $preuBase €")
    println("Preu actual de la furgo: $preuActual €")
}