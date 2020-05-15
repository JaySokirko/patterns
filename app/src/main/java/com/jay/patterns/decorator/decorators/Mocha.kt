package com.jay.patterns.decorator.decorators

import com.jay.patterns.decorator.components.Beverage
import com.jay.plus

class Mocha(private val beverage: Beverage): CondimenDecorator() {

    override var description: String = beverage.description + " with Mocha"

    override fun coast(): Double {
        return 0.7 plus beverage.coast()
    }
}