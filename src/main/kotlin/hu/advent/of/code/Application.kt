package hu.advent.of.code

import hu.advent.of.code.day1.Puzzle1A
import hu.advent.of.code.day1.Puzzle1B
import hu.advent.of.code.day2.Puzzle2A
import hu.advent.of.code.day2.Puzzle2B
import hu.advent.of.code.day3.Puzzle3A
import hu.advent.of.code.day3.Puzzle3B
import hu.advent.of.code.day4.Puzzle4A
import hu.advent.of.code.day4.Puzzle4B
import hu.advent.of.code.day5.Puzzle5A
import hu.advent.of.code.day5.Puzzle5B
import hu.advent.of.code.day6.Puzzle6A
import hu.advent.of.code.day6.Puzzle6B

class Application {
    fun doit() {
        val puzzles = listOf<BaseChallenge>(
            Puzzle1A(), Puzzle1B(), Puzzle2A(), Puzzle2B(), Puzzle3A(), Puzzle3B(), Puzzle4A(), Puzzle4B(), Puzzle5A(),  Puzzle5B(), Puzzle6A(), Puzzle6B()
        )
        puzzles.forEach { it.run() }
    }
}

fun main() {
    Application().doit()
}
