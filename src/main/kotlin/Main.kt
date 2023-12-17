package org.example

fun main() {
    println("Benvingut al programa de càlcul del valor de mercat de la Volkswagen Grand California")

    // Demanar al usuari el model de la Volkswagen i l'estat dels pneumàtics
    val model = llegirModel()
    val kmNeumaticos = llegirKmNeumaticos()

    // Calcular el preu base i el preu actual
    val preuBase = calcularPreuBase(model)
    val preuActual = calcularPreuActual(preuBase, kmNeumaticos)

    // Mostrar els resultats a l'usuari
    println("Preu base original de la furgo: $preuBase €")
    println("Preu actual de la furgo: $preuActual €")
}