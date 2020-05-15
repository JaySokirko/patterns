package com.jay.patterns.decorator.components

class Espresso: Beverage() {

    override var description: String = "Espresso"

    override fun coast(): Double = 1.99

}