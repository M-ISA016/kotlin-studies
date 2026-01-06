fun main() { // Mixing things up. Changed in: 05/01/2026

    helloWorld()
    ageVerification(22)
}
fun helloWorld() {
    println("Hello world. Subtraction result:")

fun subtraction() = println(3-2)
    println(subtraction())
}

// PARAMETERS: functions may or may not have parameters. ex.:

fun ageVerification(age: Int) {

    if (age >= 18)  println("You are $age, you can drive.")
    else println("You are $age, you cannot drive.")
}
