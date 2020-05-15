package com.jay.patterns.decorator.decorators

import com.jay.patterns.decorator.components.Beverage
import com.jay.plus

class Milk(private val beverage: Beverage) : CondimenDecorator() {

    override var description: String = beverage.description + " with Milk"

    override fun coast(): Double = 0.10 plus beverage.coast()
}