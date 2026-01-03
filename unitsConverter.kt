fun main() {
    val description = """
    Units Converter
    Choose the conversion:
   
    1: Celsius to Fahrenheit
    2: Fahrenheit to Celsius
    3: Kilometers to miles
    4: Miles to kilometers
    """.trimIndent()
    println(description)

    val option = readln().toDouble()

    when (option) {
        1.0 -> celsiusToFahrenheit()
        2.0 -> fahrenheitToCelsius()
        3.0 -> kilometersToMiles()
        4.0 -> milesToKilometers()

        else -> (println("Invalid option."))
    }
}
fun celsiusToFahrenheit() {
    println("Enter the value in Celsius.")

            val value = readln().toDouble()
            val fahrenheit = (value * 9/5) + 32

    println("$value°C = $fahrenheit°F")
}
fun fahrenheitToCelsius() {
    println("Enter the value in Fahrenheit.")

    val value = readln().toDouble()
    val celsius = (value - 32) * 5/9

    println("$value°F = $celsius°C")
}
fun kilometersToMiles() {
    println("Enter the value in Kilometers.")

    val value = readln().toDouble()
    val kilometers = value / 1.609344

    println("$value Kilometers = $kilometers Miles.")
}
fun milesToKilometers() {
    println("enter the value in Miles")

    val value = readln().toDouble()
    val miles = value * 1.609344

    println("$value Miles = $miles Kilometers.")
}
