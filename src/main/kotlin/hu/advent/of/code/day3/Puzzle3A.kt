package hu.advent.of.code.day3

import hu.advent.of.code.BaseChallenge

class Puzzle3A:BaseChallenge() {
    override fun run() {
        loadDataFromFile("data3.txt")
        val i = Itinerary(data.first())
        i.walk()
        println(i.getNumberOfVisitedHouses())
    }
}
