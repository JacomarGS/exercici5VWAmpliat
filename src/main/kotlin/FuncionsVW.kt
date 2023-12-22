package org.example

/**
 * This method was created to establish the value of the vehicle based on the model the user has chosen. The basic value is the default value.
 * @author jacomarGS
 * @since 21/12/2023
 * @param model it's the integer corresponding to the vehicle model chosen by the user.
 * @return output value is a double, because it's a monetary value and decimals are considered.
 */

fun calcularPreuBase(model: Int): Double {
    val preuBaseBasic = 73490.0
    val preuBaseCamper = preuBaseBasic + 20000.0

    return if (model == 1) preuBaseBasic
    else if (model == 2) preuBaseCamper
    else preuBaseBasic
}

/**
 * This method was created to calculate the current value of the user's vehicle taking into account its age, the condition of its tires and whether it has a bike rack.
 * @author jacomarGS
 * @since 21/12/2023
 * @param preuBase it's the Double value corresponding to the 'calcularPreuBase' function.
 * @param kmPneumatics it's the Long value corresponding to the 'llegirKmPneumatics' function.
 * @param anys it's the Int vale corresponding to the 'llegirAnys' function.
 * @param tienePortabicis it's the Boolean value corresponding to the 'llegirPortabicis' function.
 * @return output value is a double, because it's a monetary value and decimals are considered.
 */

fun calcularPreuActual(preuBase: Double, kmPneumatics: Long, anys:Int, tienePortabicis:Boolean): Double {
    // Bike rack: obtains a value of 250 if the user indicates that they have it and 0 if they do not have it.
    val portabicis: Float = if (tienePortabicis) 250.0f
                    else 0.0f
    // Vehicle age: a depreciation value is established considering the years that are outside and within the range between 6 and 10 years.
    val reduccioMenys6Anys = 0.00001f
    val reduccioEntre6i10Anys = 0.00002f
    val reduccioMes10Anys = 0.00004f
    val anysDelVehicle = when {
        (anys in 6 .. 10) -> reduccioEntre6i10Anys
        anys > 10 -> reduccioMes10Anys
        else -> reduccioMenys6Anys
    }
    // Tire condition: a depreciation value is established based on the number of kilometers that the user has entered.
    val reduccioPneumatics5000 = 0.0f
    val reduccioPneumatics10000 = 200.0f
    val reduccioPneumaticsMes10000 = 300.0f
    val depreciacio = preuBase * anysDelVehicle * kmPneumatics
    val reduccioPneumatics = when {
        kmPneumatics < 5000.0f -> reduccioPneumatics5000
        kmPneumatics < 10000.0f -> reduccioPneumatics10000
        else -> reduccioPneumaticsMes10000
    }
    // Return: calculation of the current price of the vehicle taking into account all of the above.
    return preuBase - depreciacio - reduccioPneumatics + portabicis
}