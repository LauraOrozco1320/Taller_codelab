package org.example

import com.sun.tools.javac.Main

//Codelab1

fun main() {
   /* val trafficLightColor = "Black"
   //parte 1
    if (trafficLightColor == "Red") {
        println("Stop")
    } else if (trafficLightColor == "Yellow") {
        println("Slow")
   } else if (trafficLightColor == "Green") {
        println("Go")
    } else {
        println("Invalid traffic-light color")
    } */
    //Parte 2
    /*val trafficLightColor = "Yellow"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    } */
//variable valor 3
    /*val x = 3*/

    //variable valor 4
    /*val x = 4
     */

 //Tipo ANY
    /*val x: Any = 20
    when (x) {
        /*2 -> println("x no es un número primo entre 1 y 10.")
        3 -> println("x no es un número primo entre 1 y 10.")
        5 -> println("x no es un número primo entre 1 y 10.")
        7 -> println("x no es un número primo entre 1 y 10.") */


        2, 3, 5, 7 -> println("x no es un número primo entre 1 y 10.")
        in 1..10 -> println("x es un numero entre 1 y 10, pero no un número primo.")
        is Int -> println("x es un número entero, pero no entre 1 y 10.")
        else -> println("x no es un número entero.")
    } */

    // Agregar una condicion adicional

    /*val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    } */

    //convertir una sentencia

    /*val trafficLightColor = "Black"
    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)
     */
    val trafficLightColor = "Blue"
    val message = when(trafficLightColor) {
        "Red" -> "Stop"
        "Yellow", "Amber" -> "Proceed with caution."
        "Green" -> "Go"
        else -> "Invalid traffic-light color"
    }
    println(message)
}


