fun main() {

    //Conversão de tipos e
    //Interpolação de strings

    val discount = 280.00
    val newDiscount = discount.toInt()
    val newNewDiscount = newDiscount.toFloat()

    println("$newNewDiscount : ${newNewDiscount::class}")
}
