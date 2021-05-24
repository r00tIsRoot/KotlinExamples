package com.isroot.kotlinExamples

open class Human(val name: String = "Anonymous") {
    init {
        println("Hello world!")
    }

    constructor(name : String, age : Int) : this(name){
        println("my old is ${age}.")
    }

    open fun introduceSelf(){
        println("my name is ${name}")
    }
}

class Developer(name: String, age: Int) : Human(name, age) {

    init {
        println("trash codes!")
    }

    override fun introduceSelf(){
        super.introduceSelf()
        println("I'm Developer.")
    }
}

fun main(){
    var human = Human("isroot")
    human.introduceSelf()

    println()
    human = Human("isroot", 30)
    human.introduceSelf()

    println()
    val developer = Developer("isroot", 30)
    developer.introduceSelf()
}