package com.jay.patterns.adapter.adaptee.duck

class WildTurkey: Turkey {

    override fun gobble() {
        println(javaClass.name + " gobble")
    }

    override fun fly() {
        println(javaClass.name + " fly")
    }
}