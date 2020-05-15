package com.jay.patterns.state.concreteState

import com.jay.patterns.state.context.Player
import com.jay.patterns.state.state.PlayerState

class PlayState: PlayerState() {

    override fun getName(): String = "play"

    override fun play(state: Player) {
        println("already playing")
    }

    override fun stop(state: Player) {
        state.currentState = StopState()
    }
}