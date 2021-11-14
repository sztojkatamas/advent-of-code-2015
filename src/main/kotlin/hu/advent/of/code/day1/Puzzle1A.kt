package hu.advent.of.code.day1

import hu.advent.of.code.BaseChallenge


class Puzzle1A: BaseChallenge() {

    override fun run() {
        println("\nDay 1 - Puzzle 1")
        loadDataFromFile("data1.txt")

        val up = data.first().count { it.equals('(') }
        val down = data.first().count { it.equals(')') }
        println("Floor: ${up-down}")
    }


}