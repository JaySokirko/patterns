package com.jay.patterns.adapter.client

import com.jay.patterns.adapter.target.Duck

class MallardDuck: Duck {

    override fun quack() {
        println(javaClass.name + " quack")
    }

    override fun fly() {
        println(javaClass.name + " fly")
    }
}