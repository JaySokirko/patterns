package com.jay.patterns.state.state

import com.jay.patterns.state.context.Player

abstract class PlayerState {

    abstract fun getName(): String
    abstract fun play(state: Player)
    abstract fun stop(state: Player)

}