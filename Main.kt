fun main() {
    // Functions Overload
    val age = 20
    val name = "Jose"
    val isAdmin = true

    loginVerifying(age, name, isAdmin)
    loginVerifying(age, name)
}
    fun loginVerifying(age: Int, name: String, isAdmin: Boolean) { // same name in both, but different parameters.
        println("Age: $age, name: $name, Admin: $isAdmin.")
    }
    fun loginVerifying(age: Int, name: String) { // If both had the same parameters, there would be an error.
        println(("$age, $name.")::class)
    }