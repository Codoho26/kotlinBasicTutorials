package p2_functions

// 1- Functions can be defined out of scope of classes
fun getGreeting(): String {
    return "Hello world"
}

// 2- one line definition of the function (also smart type inference)
fun getGreetingSingleLine() = "Hello world single line"

// 3- void function
fun printGreetingExplicitVoidTypeDecl(): Unit {
    println("hello from print")
}

fun printGreeting() {
    println("hello from print")
}

// 4- function parameters
fun sayYourGreeting(words: String) = println("Here is you greeting: $words")

fun main() {
    // 1-
    println(getGreeting())

//    // 2-
//    println(getGreetingSingleLine())
//
//    // 3-
//    printGreetingExplicitVoidTypeDecl()
//    printGreeting()
//
//    // 4-
//    sayYourGreeting("blbalba yohoo")
}