fun main() {

    val name = "John"
    val age = 16
    val isAdmin = false

    verifyAge(name, age, isAdmin) // Arguments between parentheses.
}
fun verifyAge(name: String, age: Int, isAdmin: Boolean) { // Parameters: when the variable and its type are declared in the function.
    if (age >= 18) {
        println("My name is $name. I am Admin: $isAdmin.")
    }
}
