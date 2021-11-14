package hu.advent.of.code.day5

import hu.advent.of.code.BaseChallenge

class Puzzle5B:BaseChallenge() {
    override fun run() {
        loadDataFromFile("data5.txt")
        val numberOfNiceStrings = data.filter { isNice(it) }.count()
        println("Nice Strings: $numberOfNiceStrings")
    }

    private operator fun String.minus(s: String): String {
        return this.replace(s, "")
    }

    fun isNice(stringToCheck:String ):Boolean {
        return hasDoublesWithGap(stringToCheck) && hasNonOverlappingPairs(stringToCheck)
    }

    fun hasDoublesWithGap(stringToCheck: String):Boolean {
        if (stringToCheck.length > 2) {
            for (i in 3..stringToCheck.length) {
                if (stringToCheck[i-3].toInt() - stringToCheck[i-1].toInt() == 0) {
                    return true
                }
            }
        }
        return false
    }

    fun hasNonOverlappingPairs(stringToCheck: String): Boolean {
        if (stringToCheck.length > 1) {
            for (i in 2..stringToCheck.length) {
                val subStr = stringToCheck.substring((i-2) until i)
                if (stringToCheck.length - (stringToCheck-subStr).length > 3) {
                    return true
                }
            }
        }
        return false
    }

}
