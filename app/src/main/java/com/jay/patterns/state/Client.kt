package com.jay.patterns.state

import com.jay.patterns.state.context.Player

fun main(){

    val player = Player()
    player.play()
    player.play()
    player.stop()
    player.stop()
    player.play()
}