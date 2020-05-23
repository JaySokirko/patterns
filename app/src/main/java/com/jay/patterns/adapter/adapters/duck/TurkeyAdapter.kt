package com.jay.patterns.adapter.adapters.duck

import com.jay.patterns.adapter.adaptee.duck.Turkey
import com.jay.patterns.adapter.target.duck.Duck

class TurkeyAdapter(private val turkey: Turkey) : Duck {

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        turkey.fly()
    }
}