package org.example

fun calcularPreuBase(model: String): Double {
    val preuBaseNormal = 73490.0
    val preuBaseCamper = preuBaseNormal + 20000.0

    return if (model.equals("normal", ignoreCase = true)) preuBaseNormal
    else preuBaseCamper
}

fun calcularPreuActual(preuBase: Double, kmNeumaticos: Long): Double {
    val depreciacioPerKm = 0.00001
    val reduccioNeumaticos5000 = 0
    val reduccioNeumaticos10000 = 200
    val reduccioNeumaticosMes10000 = 300

    val depreciacio = preuBase * depreciacioPerKm * kmNeumaticos
    val reduccioNeumaticos = when {
        kmNeumaticos < 5000 -> reduccioNeumaticos5000
        kmNeumaticos < 10000 -> reduccioNeumaticos10000
        else -> reduccioNeumaticosMes10000
    }

    return preuBase - depreciacio - reduccioNeumaticos
}