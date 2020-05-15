package com.jay.patterns.decorator.components

abstract class Beverage {

    open var description: String = "Unknown beverage"

    abstract fun coast(): Double
}