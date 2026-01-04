fun main() {
 // here, I want to change the name from "Tiago" to "Thiago".

    val userA = user()
    val userB = user()

    userA.name =  "Tiago"
    userB.name = "Bruno"

    userA.printUppercase()
    userB.printUppercase()
}

/* This one does the same thing, but in another way: there is a new property/behavior to the class, in a way that reflects
 on the other objects. */

class user {
    var name: String = " "

    fun printUppercase() {
        println("Hi," + name.uppercase())
    }
    fun updateName(newName: String) {
        name = newName
    }
}
