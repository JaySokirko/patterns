package com.jay.patterns.templeteMethod

import com.jay.patterns.templeteMethod.Game.GameCode


fun main(){
    val gameCode = GameCode.CHESS

    val game: Game = when (gameCode) {
        GameCode.CHESS -> Chess()
        GameCode.MONOPOLY -> Monopoly()
    }

    game.playOneGame(2)
}