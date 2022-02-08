package ru.netology.homework_2

fun main(){
    val isRegularCustomer = true
    val itemCount = 3
    val itemPrice = 9876
    val sumAllPurchases = 35000

    val purchase = (itemCount * itemPrice).toDouble()
    val purchaseWithDiscount = if (sumAllPurchases > 1001 && sumAllPurchases <= 10000) {
        purchase - 100
    } else if(sumAllPurchases > 10000) {
        purchase - purchase * 0.05
    } else purchase
    val finalSumPurchase = if (isRegularCustomer) purchaseWithDiscount - purchaseWithDiscount * 0.01 else purchaseWithDiscount
    println(finalSumPurchase)
}

