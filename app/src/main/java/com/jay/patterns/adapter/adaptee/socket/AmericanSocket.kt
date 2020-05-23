package com.jay.patterns.adapter.adaptee.socket

class AmericanSocket: IAmericanSocket {

    override fun charge() {
        println("charging from 120v")
    }
}