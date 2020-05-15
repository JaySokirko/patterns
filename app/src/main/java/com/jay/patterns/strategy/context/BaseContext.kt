package com.jay.patterns.strategy.context

import com.jay.patterns.strategy.strategy.IFlyStrategy
import com.jay.patterns.strategy.strategy.IQuackStrategy

abstract class BaseContext {

    abstract var flyStrategy: IFlyStrategy?
    abstract var quackStrategy: IQuackStrategy?

    abstract fun someMethod()
    abstract fun quack()
    abstract fun fly()
}