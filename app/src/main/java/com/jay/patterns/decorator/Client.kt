package com.jay.patterns.decorator

import com.jay.patterns.decorator.components.Beverage
import com.jay.patterns.decorator.components.Espresso
import com.jay.patterns.decorator.decorators.Milk
import com.jay.patterns.decorator.decorators.Mocha
import com.jay.patterns.decorator.decorators.Soy
import com.jay.patterns.decorator.decorators.Whip

fun main(){
    var beverageEspresso: Beverage = Espresso()
    beverageEspresso = Mocha(beverageEspresso)
    beverageEspresso = Milk(beverageEspresso)
    beverageEspresso = Soy(beverageEspresso)
    beverageEspresso = Whip(beverageEspresso)
    println("${beverageEspresso.description} ${beverageEspresso.coast()}")
}