fun main() {     // Colored terminal by ChatGPT
    val reset = "\u001B[0m"
    val green = "\u001B[32m"
    val yellow = "\u001B[33m"
    val cyan = "\u001B[36m"
    val red = "\u001B[31m"

    println("${cyan}🔄 Welcome to the Units Converter 🔄$reset")

    while (true) {
        println("\n${yellow}Choose the conversion:$reset")
        println("${green}1:${reset} Celsius to Fahrenheit")
        println("${red}0: Exit$reset")

        val option = readln().toIntOrNull()

        when (option) {
            1 -> celsiusToFahrenheit()
            0 -> {
                println("${cyan}Goodbye! 👋$reset")
                break
            }
            else -> println("${red}Invalid option. Try again.$reset")
        }
    }
}

fun celsiusToFahrenheit() {
    val green = "\u001B[32m"
    val reset = "\u001B[0m"
    println("${green}Enter the value in Celsius:$reset")
    val value = readln().toDouble()
    val fahrenheit = (value * 9 / 5) + 32
    println("$value°C = $fahrenheit°F")
}

// repeat the same color styling in the other functions if you like
