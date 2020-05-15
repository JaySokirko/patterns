package com.jay.patterns.proxy

import com.jay.patterns.proxy.proxy.MathProxy

fun main(){

    val math =  MathProxy()
    println("4 + 2 = " + math.add(4.0, 2.0));
    println("4 - 2 = " + math.sub(4.0, 2.0));
    println("4 * 2 = " + math.mul(4.0, 2.0));
    println("4 / 2 = " + math.div(4.0, 2.0));
}