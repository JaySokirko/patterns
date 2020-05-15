package com.jay.patterns.composite.leaf

import com.jay.patterns.composite.component.Graphic

/** "Ellipse" */
class Ellipse: Graphic() {

    override fun print() {
        println("ellipse")
    }
}