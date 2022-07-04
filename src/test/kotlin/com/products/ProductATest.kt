package com.products

import kotlin.test.assertEquals
import kotlin.test.Test
import com.products.A

class ProductATest {

    @Test
    fun `Product name is A`() {
        val a = A()

        assertEquals("A", a.getName())
    }

    @Test
    fun `Product price is 75p`() {
        val a = A()

        assertEquals(0.75, a.getPrice())
    }
}