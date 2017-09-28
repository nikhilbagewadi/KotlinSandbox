package com.nikhil.kotlin.sandbox.animals

interface Animal {

    fun setName(name: String)

    fun getName(): String

    fun makeSound()

    fun getSound(): String

    fun getLimbCount(): Int

}