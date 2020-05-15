package com.jay.patterns.strategy.context

import com.jay.patterns.strategy.strategy.IFlyStrategy
import com.jay.patterns.strategy.strategy.IQuackStrategy
import java.lang.NullPointerException

class ConcreteContext2: BaseContext() {

    override var flyStrategy: IFlyStrategy? = null
    override var quackStrategy: IQuackStrategy? = null

    override fun someMethod() {
        println(javaClass.name)
    }

    override fun quack() {
        if (quackStrategy == null) throw NullPointerException("set quack strategy")
        quackStrategy?.quack()
    }

    override fun fly() {
        if (flyStrategy == null) throw NullPointerException("set fly strategy")
        flyStrategy?.fly()
    }
}