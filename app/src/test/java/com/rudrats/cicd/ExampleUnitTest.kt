package com.rudrats.cicd

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun addition_isTrue() {
        assertEquals("Abhishek", "Abhi + Rai")
    }

    @Test
    fun addition_isTrueOrFalse() {
        assertTrue(true);
    }

    @Test
    fun addition_isTrueOrFalse2() {
        assertTrue(false);
    }
}