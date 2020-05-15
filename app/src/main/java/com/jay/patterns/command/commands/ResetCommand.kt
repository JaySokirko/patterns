package com.jay.patterns.command.commands

import com.jay.patterns.command.receivers.Computer

/**
 * Concrete command
 */
class ResetCommand(private val computer: Computer):
    Command {

    override fun execute() {
        computer.reset()
    }

}