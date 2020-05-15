package com.jay.patterns.composite.composite

import com.jay.patterns.composite.component.Graphic


class GraphicComposite : Graphic() {

    private val list: MutableList<Graphic> = mutableListOf()

    override fun print() {
        list.forEach { println(it.print()) }
    }

    override fun add(graphic: Graphic) {
        list.add(graphic)
    }

    override fun remove(graphic: Graphic) {
        list.remove(graphic)
    }
}