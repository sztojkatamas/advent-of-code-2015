package hu.advent.of.code.day3

import hu.advent.of.code.BaseChallenge

class Puzzle3B:BaseChallenge() {
    override fun run() {
        println("\nDay 3 - Puzzle 2")
        loadDataFromFile("data3.txt")
        val itinerary = Itinerary(data.first())
        val i1 = Itinerary(itinerary.getPath(Itinerary.SANTA))
        val i2 = Itinerary(itinerary.getPath(Itinerary.ROBOT))

        val m = i1.walk().map + i2.walk().map

        println("Santa with Robot: ${m.filter { it.value >= 1 }.count()}")
    }
}
