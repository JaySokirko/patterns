package com.jay.patterns.observer.observers

class ConcreteObserver: Observer {

    private var temperature = 0f
    private var humidity = 0f
    private var pressure = 0f

    override fun update(temp: Float, humidity: Float, pressure: Float) {
        this.temperature = temp
        this.humidity = humidity
        this.pressure = pressure
        handleUpdates()
    }

    private fun handleUpdates() {
        println("ConcreteObserver(temperature=$temperature, " +
                    "humidity=$humidity, pressure=$pressure)")
    }
}