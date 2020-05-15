package com.jay.patterns.observer.observers

interface Observer {
    fun update(temp: Float, humidity: Float, pressure: Float)
}