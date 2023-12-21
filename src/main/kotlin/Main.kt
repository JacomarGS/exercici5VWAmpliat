package org.example

fun main() {
    println(CYAN_BOLD_BRIGHT +
            " ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣀⣀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⣀⣤⣶⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣶⣤⣀⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⣠⣾⣿⡿⠟⠋⠁⠀⠀⠀⠀⠀⠀⠈⠙⠻⢿⣿⣷⣄⠀⠀⠀⠀\n" +
            "⠀⠀⢠⣾⣿⡿⠋⠀⠀⡀⠀⠀⣶⣶⣶⣶⠂⠀⢀⠀⠀⠙⢿⣿⣷⡄⠀⠀\n" +
            "⠀⢠⣿⣿⠏⠀⠀⣠⣾⣿⡀⠀⠘⣿⣿⠃⠀⠀⣾⣷⣄⠀⠀⠹⣿⣿⡄⠀\n" +
            "⢠⣿⣿⠏⠀⠀⠀⠸⣿⣿⣷⡀⠀⠘⠇⠀⠀⣾⣿⣿⡏⠀⠀⠀⠹⣿⣿⡄\n" +
            "⢸⣿⣿⠀⠀⢠⠀⠀⠹⣿⣿⣷⣀⣀⣀⣀⣼⣿⣿⡟⠀⠀⡀⠀⠀⣿⣿⡇\n" +
            "⢸⣿⣿⠀⠀⢸⣇⠀⠀⢻⣿⣿⣿⣿⣿⣿⣿⣿⡟⠀⠀⣰⡇⠀⠀⣿⣿⡇\n" +
            "⢸⣿⣿⠀⠀⢸⣿⣆⠀⠀⢻⠏⠉⠉⡉⠉⠙⡿⠀⠀⢰⣿⡇⠀⠀⣿⣿⡇\n" +
            "⠘⣿⣿⣆⠀⠀⢻⣿⣆⠀⠀⠀⠀⣼⣧⠀⠀⠀⠀⢠⣿⡟⠀⠀⣰⣿⣿⠃\n" +
            "⠀⠘⣿⣿⣆⠀⠀⠙⢿⡄⠀⠀⣼⣿⣿⣧⠀⠀⢀⡿⠋⠀⠀⣰⣿⣿⠃⠀\n" +
            "⠀⠀⠘⢿⣿⣷⣄⠀⠀⠉⠀⠴⠿⠿⠿⠿⠧⠀⠈⠀⠀⣠⣾⣿⡿⠃⠀⠀\n" +
            "⠀⠀⠀⠀⠙⢿⣿⣷⣦⣄⡀⠀⠀⠀⠀⠀⠀⢀⣠⣴⣾⣿⡿⠋⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠉⠛⠿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠛⠉⠀⠀⠀⠀⠀⠀\n" +
            "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀"
            + RESET)
    println(CYAN_BOLD_BRIGHT +
            " _    __      ____                                           ______                     __   ______      ___ ____                 _      \n" +
            "| |  / /___  / / /________      ______ _____ ____  ____     / ____/________ _____  ____/ /  / ____/___ _/ (_) __/___  _________  (_)___ _\n" +
            "| | / / __ \\/ / //_/ ___/ | /| / / __ `/ __ `/ _ \\/ __ \\   / / __/ ___/ __ `/ __ \\/ __  /  / /   / __ `/ / / /_/ __ \\/ ___/ __ \\/ / __ `/\n" +
            "| |/ / /_/ / / ,< (__  )| |/ |/ / /_/ / /_/ /  __/ / / /  / /_/ / /  / /_/ / / / / /_/ /  / /___/ /_/ / / / __/ /_/ / /  / / / / / /_/ / \n" +
            "|___/\\____/_/_/|_/____/ |__/|__/\\__,_/\\__, /\\___/_/ /_/   \\____/_/   \\__,_/_/ /_/\\__,_/   \\____/\\__,_/_/_/_/  \\____/_/  /_/ /_/_/\\__,_/  \n" +
            "                                     /____/                                                                                              \n"
            + RESET)
    println()
    println(CYAN_BOLD_BRIGHT + "Benvingut al programa de càlcul del valor de mercat de la Volkswagen Grand California" + RESET)
    println()
    val model = llegirModel()
    val anys = llegirAnys()
    val kmPneumatics = llegirKmPneumatics()
    val portabicis = llegirPortabicis()
    val preuBase = calcularPreuBase(model)
    val preuActual = calcularPreuActual(preuBase, kmPneumatics, anys, portabicis)
    println(CYAN + "Preu base del seu Volkswagen Grand Califòrnia: $preuBase €" + RESET)
    println(CYAN + "Preu actual del seu Volkswagen Grand Califòrnia: $preuActual €" + RESET)
}