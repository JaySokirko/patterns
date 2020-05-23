package com.jay.patterns.command

import com.jay.patterns.command.concreteComand.computer.OffCommand
import com.jay.patterns.command.concreteComand.computer.OnCommand
import com.jay.patterns.command.concreteComand.computer.ResetCommand
import com.jay.patterns.command.invoker.computer.User
import com.jay.patterns.command.receiver.computer.Computer

fun main(){

    val computer = Computer()
    val onCommand = OnCommand(computer)
    val offCommand = OffCommand(computer)
    val restartCommand = ResetCommand(computer)
    val user = User(onCommand, offCommand, restartCommand)

    user.onComputer()
    user.offComputer()
    user.restartComputer()
}