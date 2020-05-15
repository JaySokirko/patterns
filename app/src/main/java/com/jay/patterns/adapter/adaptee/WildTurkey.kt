package com.jay.patterns.adapter.adaptee

class WildTurkey: Turkey {

    override fun gobble() {
        println(javaClass.name + " gobble")
    }

    override fun fly() {
        println(javaClass.name + " fly")
    }
}