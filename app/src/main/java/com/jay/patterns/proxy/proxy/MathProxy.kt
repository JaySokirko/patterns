package com.jay.patterns.proxy.proxy

import com.jay.patterns.proxy.realSubject.Math
import com.jay.patterns.proxy.subject.IMath

class MathProxy: IMath {

    private var math: Math = Math()

    override fun add(x: Double, y: Double): Double {
        return math.add(x, y)
    }

    override fun sub(x: Double, y: Double): Double {
        return math.sub(x, y)
    }

    override fun mul(x: Double, y: Double): Double {
        return math.mul(x, y)
    }

    override fun div(x: Double, y: Double): Double {
        return math.div(x, y)
    }
}