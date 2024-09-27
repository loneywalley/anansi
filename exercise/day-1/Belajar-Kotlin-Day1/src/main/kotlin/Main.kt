package org.example

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int
import com.sun.tools.javac.jvm.PoolConstant.LoadableConstant.Int
import java.util.*


fun main() {
    println("Hello World")
    var num = Scanner(System.`in`)
    var score = num.nextInt()
    when(score){
        in 90..100 -> print("A")
        in 80..89 -> print("B")
        in 70..79 -> print("C")
        in 61..69 -> print("D")
        in 0..60 -> print("F")
        !in 0..100 -> print("Invalid")
    }
}