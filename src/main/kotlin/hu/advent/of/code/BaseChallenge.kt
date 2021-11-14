package hu.advent.of.code

import com.google.common.io.Resources
import java.io.File

abstract class BaseChallenge {

    lateinit var data:List<String>

    open fun run() {
        // To be overwritten
    }

    fun loadDataFromFile(filename: String) {
        data = File(Resources.getResource(filename).toURI()).readLines()
    }
}