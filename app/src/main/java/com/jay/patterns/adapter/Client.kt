package com.jay.patterns.adapter

import com.jay.patterns.adapter.adaptee.duck.WildTurkey
import com.jay.patterns.adapter.adaptee.socket.AmericanSocket
import com.jay.patterns.adapter.adaptee.socket.IAmericanSocket
import com.jay.patterns.adapter.adapters.duck.TurkeyAdapter
import com.jay.patterns.adapter.adapters.socket.AmericanToEuropeanSocketAdapter
import com.jay.patterns.adapter.target.duck.Duck
import com.jay.patterns.adapter.target.duck.MallardDuck
import com.jay.patterns.adapter.target.socket.IEuropeanSocket

fun main() {
    val mallardDuck = MallardDuck()
    val wildTurkey = WildTurkey()
    val turkeyAdapter = TurkeyAdapter(wildTurkey)

    test(mallardDuck)
    test(turkeyAdapter)

    val americanSocket: IAmericanSocket = AmericanSocket()
    val americanToEuropeanSocketAdapter = AmericanToEuropeanSocketAdapter(americanSocket)
    someClient(americanToEuropeanSocketAdapter)
}

fun test(duck: Duck) {
    duck.fly()
    duck.quack()
}

// a client requires european socket, but we want use american socket
// to solve this need to create american socket to european socket adapter
fun someClient(socket: IEuropeanSocket) {
    socket.charge()
}