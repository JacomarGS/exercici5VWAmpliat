package org.example

fun calcularPreuBase(model: Int): Double {
    val preuBaseBasic = 73490.0
    val preuBaseCamper = preuBaseBasic + 20000.0

    return if (model == 1) preuBaseBasic
    else if (model == 2) preuBaseCamper
    else preuBaseBasic
}

fun calcularPreuActual(preuBase: Double, kmPneumatics: Long, anys:Int, tienePortabicis:Boolean): Double {
    val portabicis: Float = if (tienePortabicis) 250.0f
                    else 0.0f
    val reduccioMenys6Anys = 0.00001f
    val reduccioEntre6i10Anys = 0.00002f
    val reduccioMes10Anys = 0.00004f
    val anysDelVehicle = when {
        (anys in 6 .. 10) -> reduccioEntre6i10Anys
        anys > 10 -> reduccioMes10Anys
        else -> reduccioMenys6Anys
    }
    val reduccioPneumatics5000 = 0.0f
    val reduccioPneumatics10000 = 200.0f
    val reduccioPneumaticsMes10000 = 300.0f

    val depreciacio = preuBase * anysDelVehicle * kmPneumatics
    val reduccioPneumatics = when {
        kmPneumatics < 5000.0f -> reduccioPneumatics5000
        kmPneumatics < 10000.0f -> reduccioPneumatics10000
        else -> reduccioPneumaticsMes10000
    }

    return preuBase - depreciacio - reduccioPneumatics + portabicis
}