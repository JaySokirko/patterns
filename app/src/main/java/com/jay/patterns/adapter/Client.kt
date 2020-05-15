package com.jay.patterns.adapter

import com.jay.patterns.adapter.adaptee.WildTurkey
import com.jay.patterns.adapter.adapters.TurkeyAdapter
import com.jay.patterns.adapter.client.MallardDuck
import com.jay.patterns.adapter.target.Duck

fun main(){
    val mallardDuck = MallardDuck()
    val wildTurkey = WildTurkey()
    val turkeyAdapter =
        TurkeyAdapter(wildTurkey)

    test(mallardDuck)
    test(turkeyAdapter)
}

fun test(duck: Duck){
    duck.fly()
    duck.quack()
}