package com.jay.patterns.decorator.decorators

import com.jay.patterns.decorator.components.Beverage

abstract class CondimenDecorator: Beverage() {

    abstract override var description: String

}