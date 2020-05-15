package com.jay.patterns.composite.leaf

import com.jay.patterns.composite.component.Graphic

/** "Leaf" */
class Circle : Graphic() {

    override fun print() {
        println("Circle")
    }
}