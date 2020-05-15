package com.jay.patterns.proxy.realSubject

import com.jay.patterns.proxy.subject.IMath

class Math : IMath {

    override fun add(x: Double, y: Double): Double {
        return x + y
    }

    override fun sub(x: Double, y: Double): Double {
        return x - y
    }

    override fun mul(x: Double, y: Double): Double {
        return x * y
    }

    override fun div(x: Double, y: Double): Double {
        return x / y
    }
}