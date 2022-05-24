package p1_variables

//// 4- variables and functions can be defined outside scope of classes
//const val name = "name1"
//var globalGreeting: String? = "Hello world"

fun main() {
    // 1- variable definition
    // val: to define final variables
    // var: to define non-final variables
    val greeting: String = "Hello there"
    println(greeting)
    var variableGreeting: String = "Hi"
    variableGreeting = "Hi there"
    println("this is my greeting $variableGreeting")

//    // 2- variable definition, smart type inference
//    val myGreeting = "String type was inferred"
//    println(myGreeting.lowercase())
//
//    // Note: everything is truly object, there are no primitive types (int, float, char, ...)
//    val num: Int = 12
//
//    // 3- null type handling
//    // NOTE: Elvis operator ? is used (instead of typical Optional<> in Java)
//    val nullableGreeting = getMyNullString()
//    // which is simplified version of:
//    // val nullableGreeting: String? = getMyNullString()
//    println(nullableGreeting?.lowercase())
//
//    // 4- continued from line: 3
//    println("greeting $globalGreeting from $name")
//
//    // 5- when statement, which is similar to switch case
//    globalGreeting = null
//    when(globalGreeting) {
//        null -> println("No greetings")
//        else -> println(greeting)
//    }
//
//    // when can be inlined with variable definition
//    globalGreeting = "greetings"
//    val otherGreet  = when (globalGreeting) {
//        null -> "nothing to say"
//        else -> globalGreeting
//    } + " from global greetings"
//
//    println(otherGreet)
}

fun getMyNullString(): String? {
    return null
}
