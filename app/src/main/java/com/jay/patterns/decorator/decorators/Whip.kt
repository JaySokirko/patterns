package com.jay.patterns.decorator.decorators

import com.jay.patterns.decorator.components.Beverage
import com.jay.plus

class Whip(private val beverage: Beverage) : CondimenDecorator() {

    override var description: String = beverage.description + " with whip"

    override fun coast(): Double {
        return 1.1 plus beverage.coast()
    }
}