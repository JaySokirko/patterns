package com.jay.patterns.command.concreteComand.computer

import com.jay.patterns.command.command.computer.ComputerCommand
import com.jay.patterns.command.receiver.computer.Computer

/**
 * Concrete command
 */
class ResetCommand(private val computer: Computer): ComputerCommand {

    override fun execute() {
        computer.reset()
    }

}