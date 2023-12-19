package org.example

fun calcularPreuBase(model: String): Double {
    val preuBaseNormal = 73490.0
    val preuBaseCamper = preuBaseNormal + 20000.0

    return if (model.equals("normal", ignoreCase = true)) preuBaseNormal
    else preuBaseCamper
}

fun calcularPreuActual(preuBase: Double, kmNeumaticos: Long, anys:Int, tienePortabicis:Boolean): Double {
    val portabicis: Float = if (tienePortabicis) 250.0f
                    else 0.0f
    val reduccioMenys6Anys = 0.00001f
    val reduccioEntre6i10Anys = 0.0002f
    val reduccioMes10Anys = 0.0004f
    val depreciacioPerKm = when {
        (anys in 6 .. 10) -> reduccioEntre6i10Anys
        anys > 10 -> reduccioMes10Anys
        else -> reduccioMenys6Anys
    }
    val reduccioNeumaticos5000 = 0.0f
    val reduccioNeumaticos10000 = 200.0f
    val reduccioNeumaticosMes10000 = 300.0f

    val depreciacio = preuBase * depreciacioPerKm * kmNeumaticos
    val reduccioNeumaticos = when {
        kmNeumaticos < 5000.0f -> reduccioNeumaticos5000
        kmNeumaticos < 10000.0f -> reduccioNeumaticos10000
        else -> reduccioNeumaticosMes10000
    }

    return preuBase - depreciacio - reduccioNeumaticos + portabicis
}