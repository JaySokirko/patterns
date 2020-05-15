package com.jay.patterns.iterator

interface Container<T> {

    fun getIterator(): Iterator<T>
}