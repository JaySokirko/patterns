package com.jay.patterns.observer

import com.jay.patterns.observer.observables.ConcreteObservable
import com.jay.patterns.observer.observers.ConcreteObserver

fun main() {
    val concreteObservable = ConcreteObservable()
    val concreteObserver = ConcreteObserver()
    concreteObservable.registerObserver(concreteObserver)
    concreteObservable.setMeasurements(12f,12f,12f)
}