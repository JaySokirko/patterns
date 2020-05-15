package com.jay.patterns.strategy.strategy

class QuackStrategy: IQuackStrategy {
    override fun quack() {
        println("quack")
    }
}