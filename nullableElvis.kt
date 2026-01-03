fun main() {
    println("Insira o nome do usuário.")

    val username: String? = null
    val nullString = username ?: "Usuário desconhecido"

    println("Bem vindo(a), $nullString!")
}
