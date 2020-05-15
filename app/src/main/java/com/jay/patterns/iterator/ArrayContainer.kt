package com.jay.patterns.iterator

class ArrayContainer<T>(val array: Array<T>) : Container<T> {

    override fun getIterator(): Iterator<T> = ArrayIterator()

    private inner class ArrayIterator: Iterator<T>{

        var index = 0

        override fun hasNext(): Boolean {
            return index < array.size
        }

        override fun next(): T {
            return if (hasNext()) array[index++]
            else array[array.size - 1]
        }

        override fun remove(item: T) {
            for (i: Int in array.indices){
                if (array[i] == item) array.drop(i)
            }
        }

    }
}