package com.jay.patterns.adapter.adapters

import com.jay.patterns.adapter.adaptee.Turkey
import com.jay.patterns.adapter.target.Duck

class TurkeyAdapter(private val turkey: Turkey) : Duck {

    override fun quack() {
        turkey.gobble()
    }

    override fun fly() {
        turkey.fly()
    }
}