package com.jay.patterns.state.concreteState

import com.jay.patterns.state.context.Player
import com.jay.patterns.state.state.PlayerState

class StopState : PlayerState() {

    override fun getName(): String = "stop"

    override fun play(state: Player) {
        state.currentState = PlayState()
    }

    override fun stop(state: Player) {
        println("already stopped")
    }
}