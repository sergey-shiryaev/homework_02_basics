package ru.netology

fun main() {

    val commissionPercent = 0.0075
    val commissionMin = 35
    val transactionMoney = 10_000
    val commission = if (transactionMoney * commissionPercent > commissionMin) {
        transactionMoney * commissionPercent
    } else commissionMin
    val amount = transactionMoney - commission.toInt()

    println("Your commission is ${commission.toInt()}")
    println("Amount for transaction is $amount")

}