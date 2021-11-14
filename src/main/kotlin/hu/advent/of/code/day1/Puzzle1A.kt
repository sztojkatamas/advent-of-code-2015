package hu.advent.of.code.day1

import hu.advent.of.code.BaseChallenge


class Puzzle1A: BaseChallenge() {

    override fun run() {
        loadDataFromFile("data1.txt")

        var up = data.first().count { it.equals('(') }
        var down = data.first().count { it.equals(')') }
        println("Floor: ${up-down}")
    }


}