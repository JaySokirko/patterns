package com.jay.patterns.templeteMethod

abstract class Game {

    private var playersAmount = 0

    protected abstract fun initializeGame()

    protected abstract fun playGame()

    protected abstract fun endGame()

    protected abstract fun printWinner()

    fun playOneGame(playersAmount: Int) {
        setPlayersAmount(playersAmount)
        initializeGame()
        playGame()
        endGame()
        printWinner()
    }

    open fun setPlayersAmount(playersAmount: Int) {
        this.playersAmount = playersAmount
    }

    enum class GameCode {
        CHESS,
        MONOPOLY
    }
}