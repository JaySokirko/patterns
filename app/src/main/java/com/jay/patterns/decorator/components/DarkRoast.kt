package com.jay.patterns.decorator.components

class DarkRoast: Beverage() {

    override var description: String ="Dark Roast"

    override fun coast(): Double = 1.66
}