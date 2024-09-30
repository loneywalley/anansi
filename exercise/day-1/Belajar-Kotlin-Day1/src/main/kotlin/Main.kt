package org.example

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int
import com.sun.tools.javac.jvm.PoolConstant.LoadableConstant.Int
import java.util.*


fun main() {
//    println("Hello World")
//    var num = Scanner(System.`in`)
//    var score = num.nextInt()
//    when(score){
//        in 90..100 -> print("A")
//        in 80..89 -> print("B")
//        in 70..79 -> print("C")
//        in 61..69 -> print("D")
//        in 0..60 -> print("F")
//        !in 0..100 -> print("Invalid")
//    }
//    print("Salary : ")
//    var salary = Scanner(System.`in`).nextDouble()
//    print("Years Of Service : ")
//    var yearsOfService = Scanner(System.`in`).nextInt()
//    var bonus: Double = when(yearsOfService){
//        in 5..10 -> salary * 0.2
//        in 2..5 -> salary * 0.1
//        else -> 0.0
//    }
//    println("Bonus : " +bonus)

//    print("Total Price : ")
//    var totalPrice = Scanner(System.`in`).nextDouble()
//    var totalPriceAfterDiscount: Double =
//        if (totalPrice > 200){
//            totalPrice - (totalPrice * 0.3)
//        }else if (totalPrice > 100 && totalPrice <= 200){
//            totalPrice - (totalPrice * 0.2)
//        }else if (totalPrice > 50 && totalPrice <= 100){
//            totalPrice - (totalPrice * 0.1)
//        }else if (totalPrice >= 0 && totalPrice <= 50) {
//            totalPrice
//        }else{
//            0.0
//        }
//    print("Total Price After Discount : ")
//    print(totalPriceAfterDiscount)

//    print("Total Unit : ")
//    var unit = Scanner(System.`in`).nextDouble()
//    var bill: Double =
//        if(unit >= 0 && unit <= 100){
//            unit * 1
//        }else if (unit > 100 && unit <= 200){
//            (100 * 1.0) + ((unit - 100) * 1.5)
//        }else if( unit > 200){
//            (100 * 1) + (100 * 1.5) + ((unit - 200) * 2)
//        }else{
//            0.0
//        }
//    print("Total Bill : ")
//    print(bill)

//    var numList = listOf(5, 3, 7, 0)
//    var index = 0
//
//    while (index < numList.size){
//        val num = numList[index]
//
//        if (num == 0){
//            println("You hit the 0")
//            break
//        }
//        if (num == 7){
//            println("Congrats you hit the luck number")
//            break
//        }else{
//            println("Not the number : " + num)
//        }
//        index++
//    }

//    var fuel: Int = 0
//    while (fuel <= 50){
//        println("Fuel : " + fuel)
//        fuel += 5
//        if (fuel > 40){
//            println("Fuel : " + fuel)
//            println("Fuel has reached 40 liters")
//            break
//        }
//    }

//    fun reserveSeat(name: String, seatNumber: Int) {
//        val availableSeats = arrayOf(1, 2, 3, 4, 5)
//
//        if (availableSeats.contains(seatNumber)) {
//            availableSeats[seatNumber -1] = 0  // Mark the seat as reserved by setting it to 0
//            println("$name reserved seat $seatNumber.")
//        } else {
//            println("Seat $seatNumber is already reserved.")
//        }
//    }
//
////    fun main() {
//        reserveSeat("John", 2)
//        reserveSeat("Sarah", 2)
////    }

//    // Create a set to store reserved seats
//    val reservedSeats = mutableSetOf<Int>()
//
//// Create a list of available seats
//    val availableSeats = arrayOf(1, 2, 3, 4, 5)
//
//    fun reserveSeat(name: String, seatNumber: Int) {
//        // Check if the seat is available
//        if (availableSeats.contains(seatNumber) && !reservedSeats.contains(seatNumber)) {
//            // Mark the seat as reserved
//            reservedSeats.add(seatNumber)
//            println("$name reserved seat $seatNumber.")
//        } else {
//            println("Seat $seatNumber is already reserved.")
//        }
//    }
//
////    fun main() {
//        reserveSeat("John", 2)
//        reserveSeat("Sarah", 3)
////    }

}