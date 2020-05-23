package com.jay.patterns.adapter.adapters.socket

import com.jay.patterns.adapter.adaptee.socket.IAmericanSocket
import com.jay.patterns.adapter.target.socket.IEuropeanSocket

class AmericanToEuropeanSocketAdapter(private val americanSocket: IAmericanSocket): IEuropeanSocket {

    override fun charge() {
        americanSocket.charge()
    }

}