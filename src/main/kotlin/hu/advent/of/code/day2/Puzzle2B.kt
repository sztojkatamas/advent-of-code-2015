package hu.advent.of.code.day2

import hu.advent.of.code.BaseChallenge

class Puzzle2B: BaseChallenge() {

    override fun run() {
        println("\nDay 2 - Puzzle 2")
        loadDataFromFile("data2.txt")
        var sumOfRibbonNeeded = 0L

        data.forEach(fun(s: String) {
            sumOfRibbonNeeded += PresentBox(s).ribbon()
        })
        println("$sumOfRibbonNeeded feet of ribbon needed")
    }
}