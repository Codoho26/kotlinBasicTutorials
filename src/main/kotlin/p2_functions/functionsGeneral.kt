package p2_functions

fun getGreeting(): String {
    return "Hello world"
}

fun getGreetingSingleLine() = "Hello world single line"

fun printGreetingExplicitVoidTypeDecl(): Unit {
    println("hello from print")
}

fun printGreeting() {
    println("hello from print")
}

fun sayYourGreeting(words: String) = println("Here is you greeting: $words")

fun aMagicFunction(s: String): String {
    TODO() // returns a Nothing type. Throws when called
}

fun main() {
    // 1- Functions can be defined out of scope of classes
    println(getGreeting())

    // 2- one line definition of the function (also smart type inference)
    println(getGreetingSingleLine())

    // 3- Unit (void) functions: Unit is actually a Singleton class itself!
    printGreetingExplicitVoidTypeDecl()
    printGreeting()

    // 4- function parameters
    sayYourGreeting("blbalba yohoo")

    // 5- empty TODO function
    val myVal = aMagicFunction("Hello magical function")
}
