package org.coursera.week2

data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuess(secret: String, guess: String): Evaluation {
    val positions = countPositions(secret, guess)
    var letters = mutableListOf<Char>();
    var commonLetters = 0

    for (letter in guess){
        if(!letters.contains(letter)){
            val howManyInSecret = countHowMany(secret, letter)
            val howManyInGuess = countHowMany(guess, letter)
            commonLetters += howManyInSecret.coerceAtMost(howManyInGuess)
            letters.add(letter)
        }
    }
    return Evaluation(positions, commonLetters-positions)
}

private fun countPositions(secret: String, guess: String) = secret.zip(guess).count { p -> p.first == p.second }

private fun countHowMany(letters: String, letter: Char) = letters.filter { it == letter }.count()



