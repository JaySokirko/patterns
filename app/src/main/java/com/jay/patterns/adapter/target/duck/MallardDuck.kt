package com.jay.patterns.adapter.target.duck

class MallardDuck: Duck {

    override fun quack() {
        println(javaClass.name + " quack")
    }

    override fun fly() {
        println(javaClass.name + " fly")
    }
}