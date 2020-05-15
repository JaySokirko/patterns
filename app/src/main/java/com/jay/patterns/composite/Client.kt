package com.jay.patterns.composite

import com.jay.patterns.composite.composite.GraphicComposite
import com.jay.patterns.composite.leaf.Circle
import com.jay.patterns.composite.leaf.Ellipse
import com.jay.patterns.composite.leaf.Triangle

fun main(){
    val circle = Circle()
    val triangle = Triangle()
    val ellipse = Ellipse()

    val graphicComposite1 = GraphicComposite()
    val graphicComposite2 = GraphicComposite()
    val graphicComposite3 = GraphicComposite()

    graphicComposite1.add(circle)
    graphicComposite1.add(triangle)
    graphicComposite2.add(ellipse)

    graphicComposite3.add(graphicComposite1)
    graphicComposite3.add(graphicComposite2)

    graphicComposite3.print()
}