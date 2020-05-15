package com.jay.patterns.iterator

interface Iterator<T> {

    fun hasNext(): Boolean
    fun next(): T
    fun remove(item: T)

}