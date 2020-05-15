package com.jay.patterns.state.context

import com.jay.patterns.state.concreteState.StopState
import com.jay.patterns.state.state.PlayerState

class Player {

    var currentState: PlayerState = StopState()
        set(value) {
            println("Changing state to " + value.getName() + "...")
            field = value
        }

    fun play() {
        currentState.play(this)
    }

    fun stop() {
        currentState.stop(this)
    }
}