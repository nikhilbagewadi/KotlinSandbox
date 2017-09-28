package com.nikhil.kotlin.sandbox.animals

class Lion : Animal {
    private var myName: String = "$this"

    override fun getName(): String = myName

    override fun makeSound() {
        println(getSound())
    }

    override fun getSound(): String = "Lion Roar"

    override fun getLimbCount(): Int = 4

    override fun setName(name: String) {
        myName = name
    }
}