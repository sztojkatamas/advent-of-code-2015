package hu.advent.of.code.day1

import hu.advent.of.code.BaseChallenge

class Puzzle1B: BaseChallenge() {

    override fun run() {
        println("\nDay 1 - Puzzle 2")
        loadDataFromFile("data1.txt")
        val s = data.first()
        var i = 0
        while (calculateFloor(s.substring(0,i)) != -1) {
            i++
        }
        println("Floor: $i")
    }

    private fun calculateFloor(s:String):Int {
        var up = s.count { it.equals('(') }
        var down = s.count { it.equals(')') }
        return up-down
    }


}