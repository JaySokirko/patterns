package com.jay.patterns.decorator.components

class HouseBlend: Beverage() {

    override var description: String = "House Blend"

    override fun coast(): Double = 0.89
}