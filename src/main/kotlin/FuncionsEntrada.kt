package org.example

/**
 * This method was created to prompt the user for an Int input, incorporating an error handling function created by @raimon.izard.
 * @author jacomarGS
 * @since 21/12/2023
 * @return output value of type integer
 */

fun llegirModel(): Int {
    val controlErrorsModel = readInt(
        pMessageIn = CYAN + "Si us plau, seleccioneu el vostre model:\n" + "1. Volkswagen Grand California: model bàsic.\n" + "2. Volkswagen Grand California: model Camper Full Equip.\n" + RESET
        , pMessageErrorDT = "Si us plau, premeu 1 per seleccionar la Volkswagen Grand Califòrnia: model bàsic o 2 per seleccionar la Volkswagen Grand Califòrnia: model Camper Full Equip."
        , pMessageErrorDV = "Si us plau, premeu 1 per seleccionar la Volkswagen Grand Califòrnia: model bàsic o 2 per seleccionar la Volkswagen Grand Califòrnia: model Camper Full Equip."
        , pMin = 1
        , pMax = 2
    )
    return controlErrorsModel
}

/**
 * This method was created to prompt the user for an Int input, incorporating an error handling function created by @raimon.izard.
 * @author jacomarGS
 * @since 21/12/2023
 * @return output value of type integer
 */

fun llegirAnys(): Int {
    val controlErrorsAnys = readInt(
        pMessageIn = CYAN + "Quants anys té el vostre vehicle?" + RESET
        , pMessageErrorDT = "Si us plau, indiqueu el nombre d'anys que té el vostre vehicle"
    )
    return controlErrorsAnys
}

/**
 * This method was created to prompt the user for a Long input, incorporating an error handling function.
 * @author jacomarGS
 * @since 21/12/2023
 * @return output value of type long integer
 */

fun llegirKmPneumatics(): Long {
    val controlErrorsKmPneumatics = readLong(
        pMessageIn = CYAN + "Quants quilòmetres tenen aproximadament els seus pneumàtics?" + RESET
        , pMessageErrorDT = "Si us plau, indiqueu el nombre aproximat de quilòmetres que tenen els pneumàtics del vostre vehicle."
    )
    return controlErrorsKmPneumatics
}

/**
 * This method was created to prompt the user for an Boolean input, incorporating an error handling function created by @raimon.izard.
 * @author jacomarGS
 * @since 21/12/2023
 * @return output value of type boolean
 */
fun llegirPortabicis(): Boolean {
    val controlErrorsPortabicis = readBoolean(
        pMessageIn = CYAN + "Disposa de portabicis? Si us plau, responeu 'true' en cas afirmatiu o 'false' en cas negatiu." + RESET
        , pMessageErrorDT = "Si us plau, escriviu la paraula 'true' en cas afirmatiu o 'false' en cas negatiu."
    )
    return controlErrorsPortabicis
}