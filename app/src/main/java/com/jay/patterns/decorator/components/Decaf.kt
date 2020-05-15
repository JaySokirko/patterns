package com.jay.patterns.decorator.components

class Decaf: Beverage() {

    override var description: String = "Decaf"

    override fun coast(): Double = 1.50
}