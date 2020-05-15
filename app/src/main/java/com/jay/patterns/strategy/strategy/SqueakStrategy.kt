package com.jay.patterns.strategy.strategy

class SqueakStrategy: IQuackStrategy {
    override fun quack() {
        println("squeak")
    }
}