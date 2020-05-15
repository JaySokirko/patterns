package com.jay.patterns.facade.facades

import com.jay.patterns.facade.parts.CPU
import com.jay.patterns.facade.parts.HardDrive
import com.jay.patterns.facade.parts.Memory

/* Facade */
class Computer() {

    private var cpu: CPU? = null
    private var memory: Memory? = null
    private var hardDrive: HardDrive? = null

    init {
        cpu = CPU()
        memory = Memory()
        hardDrive = HardDrive()
    }

    fun startComputer() {
        cpu!!.freeze()
        memory!!.load(54, hardDrive!!.read(21, 2))
        cpu!!.jump(4)
        cpu!!.execute()
    }
}