package com.group.libraryapp

import org.junit.jupiter.api.Assertions.*

import org.junit.jupiter.api.Test

internal class CalculatorTest {

  @Test
  fun add() {
    // given
    val calculator = Calculator(5)

    // when
    calculator.add(3)

    // then
    if (calculator.number != 8) {
      throw IllegalStateException()
    }
  }

  @Test
  fun minus() {
    // given
    val calculator = Calculator(5)

    // when
    calculator.minus(3)

    // then
    if (calculator.number != 2) {
      throw IllegalStateException()
    }
  }

  @Test
  fun multiply() {
    // given
    val calculator = Calculator(5)

    // when
    calculator.multiply(3)

    // then
    if (calculator.number != 15) {
      throw IllegalStateException()
    }
  }

  @Test
  fun divide() {
    // given
    val calculator = Calculator(5)

    // when
    calculator.divide(2)

    // then
    if (calculator.number != 2) {
      throw IllegalStateException()
    }
  }

  @Test
  fun divideExceptionTest() {
    // given
    val calculator = Calculator(5)

    // when & then
    try {
      calculator.divide(0)
    } catch(e: java.lang.IllegalArgumentException) {
      return
    } catch(e: Exception) {
      throw IllegalStateException()
    }
    throw IllegalStateException(" .")
  }
}
