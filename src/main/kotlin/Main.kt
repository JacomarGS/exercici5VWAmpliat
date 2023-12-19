package org.example

fun main() {
    println("Benvingut al programa de càlcul del valor de mercat de la Volkswagen Grand California")
    val model = llegirModel()
    val kmNeumaticos = llegirKmNeumaticos()
    val anys = llegirAnys()
    val portabicis = llegirPortabicis()
    val preuBase = calcularPreuBase(model)
    val preuActual = calcularPreuActual(preuBase, kmNeumaticos, anys, portabicis)
    println("Preu base original de la furgo: $preuBase €")
    println("Preu actual de la furgo: $preuActual €")
}