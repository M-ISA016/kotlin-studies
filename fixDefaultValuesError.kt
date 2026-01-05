fun main() {
    // Called a function three times, and wanted the function repeated 1 time.
    calculateDiscount(originalPrice = 100.0, discount = 10.0, tax = 5.0, promotion = "Black Friday")
    calculateDiscount(originalPrice2 = 200.0, tax2 = 20.0)
    calculateDiscount(originalPrice3 = 50.0, promotion2 = "Christmas")
}
fun calculateDiscount(originalPrice: Double = 100.0, originalPrice2: Double = 200.0, originalPrice3: Double = 50.0,
                      discount: Double = 10.0, tax: Double = 5.0, tax2: Double = 20.0, promotion:
                      String = "Black Friday", promotion2: String = "Christmas") {
    // Just do this:
    calculateDiscount(
        originalPrice = 100.0, discount = 10.0, tax = 5.0, promotion = "Black Friday", originalPrice2 = 200.0,
        tax2 = 20.0, originalPrice3 = 50.0, promotion2 = "Christmas"
    )
}
