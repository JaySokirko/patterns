package com.jay.patterns.observer.observables

import com.jay.patterns.observer.observers.Observer

interface Observable {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObserver()
}