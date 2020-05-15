package com.jay.patterns.iterator

fun main(){

    val list: Array<String> = arrayOf("a", "b", "c")
    val arrayContainer: ArrayContainer<String> = ArrayContainer(list)
    val iterator: Iterator<String> = arrayContainer.getIterator()

    while (iterator.hasNext()){
        println(iterator.next())
    }

    iterator.remove("a")
}