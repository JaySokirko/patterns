package com.jay.patterns.composite.leaf

import com.jay.patterns.composite.component.Graphic

/** "Leaf" */
class Triangle: Graphic() {

    override fun print() {
        println("Triangle")
    }
}