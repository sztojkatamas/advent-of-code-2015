package hu.advent.of.code.day3

import hu.advent.of.code.BaseChallenge

class Puzzle3A:BaseChallenge() {
    override fun run() {
        println("\nDay 3 - Puzzle 1")
        loadDataFromFile("data3.txt")
        val i = Itinerary(data.first())
        i.walk()
        println(i.getNumberOfVisitedHouses())
    }
}
