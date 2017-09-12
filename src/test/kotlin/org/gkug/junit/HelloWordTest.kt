package org.gkug.junit

import org.junit.*
import org.junit.Assert.*

class HelloWordTest {
    @Test
    fun testOk() {
        val ok = "OK";
        assertEquals("OK", ok)
    }
}


class FixtureTest {

    companion object {
        @JvmStatic
        @BeforeClass
        fun classSetup() = println("Se ejecuta antes de los otros métodos (incluidos los @Before)")

        @JvmStatic
        @AfterClass
        fun classTeardown() = println("Se ejecuta después de los otros métodos (incluidos los @After)")
    }

    @Before
    fun testSetup() = println("Se ejecuta antes de cada @Test")

    @Test
    fun testOk() {
        val ok = "OK";
        assertEquals("OK", ok)
    }

    @After
    fun testTeardown() = println("Se ejecuta después de cada @Test")
}


fun containsEvenNumber(collection: Collection<Int>): Boolean = collection.any{ x-> x%2 == 0}

class SecondaryTestClass {
    @Test fun contains() {
        assertTrue(containsEvenNumber(listOf(1, 2, 3)))
    }

    @Test fun notContains() {
        assertFalse(containsEvenNumber(listOf(1, 3, 5)))
    }
}