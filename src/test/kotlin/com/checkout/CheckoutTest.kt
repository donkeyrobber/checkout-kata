package com.checkout

import kotlin.test.Test
import kotlin.test.assertEquals
import com.checkout.checkout
import com.products.A
import com.products.Product

class CheckoutTest {

    @Test
    fun `Checkout returns correct price`() {

        val items = arrayOf<Product>(A(), A())

        assertEquals(1.50, checkout(items))

    }
}