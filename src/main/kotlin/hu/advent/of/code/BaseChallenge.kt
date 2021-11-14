package hu.advent.of.code

import java.util.*

abstract class BaseChallenge {

    var data = mutableListOf<String>()

    open fun run() {
        // To be overwritten
    }

    fun loadDataFromFile(filename: String) {
        val scanner = Scanner(this::class.java.getResourceAsStream("/$filename")!!)
        while (scanner.hasNextLine()) {
            data.add(scanner.nextLine())
        }
    }
}