package com.jay.patterns.strategy

import com.jay.patterns.strategy.strategy.FlyWithWingsStrategy
import com.jay.patterns.strategy.strategy.QuackStrategy
import com.jay.patterns.strategy.context.BaseContext
import com.jay.patterns.strategy.context.ConcreteContext1

fun main() {
    val mallardDuck: BaseContext = ConcreteContext1()
    mallardDuck.someMethod()
    mallardDuck.flyStrategy = FlyWithWingsStrategy()
    mallardDuck.fly()
    mallardDuck.quackStrategy = QuackStrategy()
    mallardDuck.quack()
}