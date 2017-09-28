package com.nikhil.kotlin.sandbox.animals

class Tiger : Animal {
    private var myName: String = "$this"

    override fun makeSound() {
        println(getSound())
    }

    override fun getName(): String = myName

    override fun getSound(): String = "Tiger Roar"

    override fun getLimbCount(): Int = 4

    override fun setName(name: String) {
        myName = name
    }
}