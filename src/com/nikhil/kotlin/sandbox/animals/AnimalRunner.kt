package com.nikhil.kotlin.sandbox.animals

import com.nikhil.kotlin.sandbox.SandboxRunner

class AnimalRunner : SandboxRunner {
    override fun runSandbox() {
        testAnimals()
    }

    private class CreatedAnimal(private val animal : Animal) : Animal by animal

    fun testAnimals() {
        val tiger = Tiger()
        CreatedAnimal(tiger).also {
            it.setName("Created Tiger")
            it.printAnimal()
        }
        val lion = Lion()
        CreatedAnimal(lion).also {
            it.setName("Created Lion")
            it.printAnimal()
        }

    }

    private fun Animal.printAnimal() {
        println("Name: ${getName()},  Sound: ${getSound()}, Limbs: ${getLimbCount()}")
    }
}