package com.jay.patterns.adapter.target.socket

class EuropeanSocket: IEuropeanSocket {

    override fun charge() {
        println("charging from 220v")
    }
}