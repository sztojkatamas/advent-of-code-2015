package hu.advent.of.code.day2

import hu.advent.of.code.BaseChallenge

class Puzzle2A: BaseChallenge() {

    override fun run() {
        println("\nDay 2 - Puzzle 1")
        loadDataFromFile("data2.txt")
        var sumOfWrapPaperNeeded = 0
        data.forEach(fun(s: String) {
            sumOfWrapPaperNeeded += PresentBox(s).wrap()
        })
        println("$sumOfWrapPaperNeeded square feet of paper needed")
    }
}