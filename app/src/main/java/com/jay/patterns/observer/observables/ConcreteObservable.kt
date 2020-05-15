package com.jay.patterns.observer.observables

import com.jay.patterns.observer.observers.Observer

class ConcreteObservable : Observable {

    private val observers: MutableList<Observer> = mutableListOf()
    private var temperature: Float = 0f
    private var pressure: Float = 0f
    private var humidity: Float = 0f

    override fun registerObserver(observer: Observer) {
        observers.add(observer)
    }

    override fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    override fun notifyObserver() {
        observers.forEach { observer -> observer.update(temperature, humidity, pressure) }
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        notifyObserver()
    }
}