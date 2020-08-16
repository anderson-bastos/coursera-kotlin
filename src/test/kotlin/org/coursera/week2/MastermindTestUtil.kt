package org.coursera.week2


import org.junit.jupiter.api.Assertions

internal fun testEvaluation(secret: String, guess: String, positions: Int, letters: Int) {
    val evaluation = evaluateGuess(secret, guess)
    Assertions.assertEquals(evaluation.rightPosition, positions)
    Assertions.assertEquals(evaluation.wrongPosition, letters)
}
