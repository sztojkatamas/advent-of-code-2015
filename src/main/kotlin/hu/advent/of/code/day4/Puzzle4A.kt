package hu.advent.of.code.day4

import hu.advent.of.code.BaseChallenge
import java.security.MessageDigest



class Puzzle4A:BaseChallenge() {
    override fun run() {
        println("\nDay 4 - Puzzle 1")
        val mySecret = "bgvyzdsv"
        var salt = 250000L // Speedup :)

        while (!goodMD5(mySecret, salt)) {
            salt++
        }
        println(salt)
    }

    fun goodMD5(secret:String, sequence:Long):Boolean {
        val s =secret.plus(sequence.toString()).md5()
        if(s.startsWith("00000")) {
            println(s)
            return true
        }
        return false
    }

    private
    fun String.md5(): String {
        return MessageDigest.getInstance("MD5").digest(this.toByteArray()).toHex()
    }

    fun ByteArray.toHex(): String {
        return joinToString("") { "%02x".format(it) }
    }
}
