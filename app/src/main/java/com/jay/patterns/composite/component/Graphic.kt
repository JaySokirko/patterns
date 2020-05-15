package com.jay.patterns.composite.component

/** "Component" */
abstract class Graphic {

    abstract fun print()

    open fun add(graphic: Graphic){
        throw UnsupportedOperationException("Operation does not support")
    }

    open fun remove(graphic: Graphic){
        throw UnsupportedOperationException("Operation does not support")
    }
}