package com.jay.patterns.command.invoker.computer

import com.jay.patterns.command.command.computer.ComputerCommand

/**
 * Invoker
 */

class User(
    private val onCommand: ComputerCommand,
    private val offCommand: ComputerCommand,
    private val restartCommand: ComputerCommand
) {
    fun onComputer() {
        onCommand.execute()
    }

    fun offComputer() {
        offCommand.execute()
    }

    fun restartComputer() {
        restartCommand.execute()
    }

}