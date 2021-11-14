package hu.advent.of.code

import com.google.common.io.Resources
import java.io.File

open class BaseChallenge:Challenge {

    lateinit var data:List<String>

    override fun run() {}

    fun loadDataFromFile(filename: String) {
        data = File(Resources.getResource(filename).toURI()).readLines()
    }
}