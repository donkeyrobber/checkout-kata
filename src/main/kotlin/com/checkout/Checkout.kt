package com.checkout

import com.products.Product

fun checkout(products: Array<Product>): Double {
    var totalCost: Double = 0.00

    for (product in products) {
        totalCost += product.getPrice()
    }

    return totalCost
}