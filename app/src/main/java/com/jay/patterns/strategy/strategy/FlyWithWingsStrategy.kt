package com.jay.patterns.strategy.strategy

class FlyWithWingsStrategy : IFlyStrategy {
    override fun fly() {
        println("fly with wings")
    }
}