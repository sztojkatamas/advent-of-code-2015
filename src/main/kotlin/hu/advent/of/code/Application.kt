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

class Application {
    val puzzle1a = Puzzle1A()
    val puzzle1b = Puzzle1B()
    val puzzle2a = Puzzle2A()
    val puzzle2b = Puzzle2B()
    val puzzle3a = Puzzle3A()
    val puzzle3b = Puzzle3B()
    val puzzle4a = Puzzle4A()
    val puzzle4b = Puzzle4B()
    val puzzle5a = Puzzle5A()
    val puzzle5b = Puzzle5B()
    //val puzzle6a = Puzzle6A()

}
fun main() {

    val application = Application()
    println("Day 1 - Puzzle 1")
    application.puzzle1a.run()

    println("Day 1 - Puzzle 2")
    application.puzzle1b.run()

    println("Day 2 - Puzzle 1")
    application.puzzle2a.run()

    println("Day 2 - Puzzle 2")
    application.puzzle2b.run()

    println("Day 3 - Puzzle 1")
    application.puzzle3a.run()

    println("Day 3 - Puzzle 2")
    application.puzzle3b.run()

    println("Day 4 - Puzzle 1")
    application.puzzle4a.run()

    println("Day 4 - Puzzle 2")
    application.puzzle4b.run()

    println("Day 5 - Puzzle 1")
    application.puzzle5a.run()

    println("Day 5 - Puzzle 2")
    application.puzzle5b.run()

    //println("Day 6 - Puzzle 1")
    //application.puzzle6a.run()

}
