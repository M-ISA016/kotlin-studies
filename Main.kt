fun main() { //This code calculates the discount on a purchase and displays a summary of the transaction.
    calculateDiscount(originalPrice = 100.0, discount = 10.0, tax = 5.0, promotion = "Black Friday", originalPrice2 = 200.0,
        tax2 = 20.0, originalPrice3 = 50.0, promotion2 = "Christmas")
}
fun calculateDiscount(originalPrice: Double = 100.0, originalPrice2: Double = 200.0, originalPrice3: Double = 50.0,
                      discount: Double = 10.0, tax: Double = 5.0, tax2: Double = 20.0, promotion:
                      String = "Black Friday", promotion2: String = "Christmas") {

    val total = originalPrice - discount + tax

    println("Transaction Summary ======")
    println()
    println("Original Price: R$$originalPrice,00")
    println("Discount: R$$discount,00")
    println("Tax: R$$tax,00")
    println("Promotion: $promotion")
    println("Final Price: R$$total,00")
    println()

    val total2 = originalPrice2 + tax2

    println("Transaction Summary ======")
    println()
    println("Original Price: R$$originalPrice2,00")
    println("Tax: R$$tax2,00")
    println("Final Price: R$$total2,00")
    println()

    val total3 = originalPrice3 + tax

    println("Transaction Summary ======")
    println()
    println("Original price: R$$originalPrice3,00")
    println("Tax: R$$tax,00")
    println("Promotion: $promotion2")
    println("Final Price: R$$total3,00")
    println()
}