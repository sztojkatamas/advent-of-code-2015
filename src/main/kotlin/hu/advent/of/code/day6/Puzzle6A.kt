package hu.advent.of.code.day6

import hu.advent.of.code.BaseChallenge
import java.awt.Color
import java.awt.image.BufferedImage
import java.io.File
import javax.imageio.ImageIO


class Puzzle6A:BaseChallenge() {
    private var image = BufferedImage(999, 999, BufferedImage.TYPE_INT_RGB)
    override fun run() {
        loadDataFromFile("data6.txt")

        clearImageBuffer()
        data.forEach { issueCommand(it) }
        println("Lights: ${countBlacks()}")
        saveImageToDisk()
    }

    private fun issueCommand(commandString:String) {
        val clist = commandString.split(" ")
        when (clist[0]) {
            "turn" -> turn(IntRange(
                    clist[2].split(",")[0].trim().toInt(),
                    clist[2].split(",")[1].trim().toInt()
            ), IntRange(
                    clist[4].split(",")[0].trim().toInt(),
                    clist[4].split(",")[1].trim().toInt()
            ), clist[1].trim().equals("on"))
            "toggle" -> toggle(
                    IntRange(
                            clist[1].split(",")[0].trim().toInt(),
                            clist[1].split(",")[1].trim().toInt()
                    ), IntRange(
                    clist[3].split(",")[0].trim().toInt(),
                    clist[3].split(",")[1].trim().toInt())
            )
        }
    }

    fun turn(from:IntRange, to:IntRange, on:Boolean) {
        //println("turn $on $from to $to")
        when (on) {
            true -> { draw(from, to, Color.BLACK) }
            false -> { draw(from, to, Color.WHITE) }
        }


    }

    fun toggle(from:IntRange, to:IntRange) {
        //println("toggle $from to $to")
        drawToggle(from, to)
    }

    private fun clearImageBuffer() {
        for (y in 0 until 999) {
            for (x in 0 until 999) {
                image.setRGB(x, y, Color.WHITE.rgb)
                //image.setRGB(x, y, Color(b, b, b).getRGB())
            }
        }
    }
    private fun draw(from:IntRange, to:IntRange, color:Color) {
        for (x in from.first until to.first) {
            for (y in from.first until to.last) {
                    image.setRGB(x, y, color.rgb)
            }
        }
    }

    private fun drawToggle(from:IntRange, to:IntRange) {
        for (x in from.first until to.first) {
            for (y in from.first until to.last) {
                when (image.getRGB(x,y)) {
                    Color.BLACK.rgb -> { image.setRGB(x, y, Color.WHITE.rgb) }
                    Color.WHITE.rgb -> { image.setRGB(x, y, Color.BLACK.rgb) }
                }

            }
        }
    }

    private fun saveImageToDisk() {
        ImageIO.write(image, "gif", File("lights.gif"))
    }

    private fun countBlacks():Int {
        var sum = 0
        for (y in 0 until 999) {
            for (x in 0 until 999) {
                if(image.getRGB(x, y).equals(Color.BLACK.rgb)) {
                    sum++
                }
            }
        }
        return sum
    }

}
