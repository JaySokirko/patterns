package com.jay.patterns.decorator.decorators

import com.jay.patterns.decorator.components.Beverage
import com.jay.plus

class Soy(private val beverage: Beverage): CondimenDecorator() {

    override var description: String = beverage.description + " with Soy"

    override fun coast(): Double {
        return 0.9 plus beverage.coast()
    }
}