package ru.netology

import kotlin.math.roundToInt

fun main() {
    val standardDiscount = 100
    val lastPurchase = 10_010
    val purchase = 100
    val discount = 0.05
    val regularCustomer = true
    val discountForRegularCustomers = 0.01
    val amount:Double = when (lastPurchase) {
        in (0..1000) -> purchase.toDouble()
        in (1001..10_000) -> (purchase - standardDiscount).toDouble()
        else -> purchase * (1 - discount)
    }
    val amountWithDiscount = if (regularCustomer) amount * (1 - discountForRegularCustomers) else amount
    val rub = amountWithDiscount.toInt()
    val penny = ((amountWithDiscount - rub) * 100).roundToInt()
    println("Стоимость Вашей покупки $rub рублей $penny копеек")
}