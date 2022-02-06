package com.nexters.unittest_practice

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class FibonacciTest {

    @Test
    fun fibonacciTest() {
        val result = Fibonacci.fib(10)

        assertThat(result).isEqualTo(55)
    }

    @Test
    fun checkBracesTest() {
        val result = Fibonacci.checkBraces("(a * b)")

        assertThat(result).isTrue()
    }

}