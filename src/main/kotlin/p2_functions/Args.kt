package p2_functions

fun sayThings(greeting: String, things : List<String>?) {
    things?.forEach {
        println("$greeting to $it")
    }
}

fun sayThingsVararg(greeting: String, vararg things : String) {
    things.forEach {
        println("$greeting to $it")
    }
}

fun namedArgsGreeting(name: String = "unknown person", greeting: String = "Hellooooo") {
    println("$greeting from $name")
}

fun main() {
    // 1- we can pass a list of things (fixed size)
    val things = listOf("desk", "other thing", "chair")
    sayThings("Hello", things)

//    // 2- can also pass empty list or null (if defined using Elvis operator ?)
//    sayThings("Hello",  listOf())
//    sayThings("hey", null)
//
//    // 3- But can also use variadic vararg format
//
//    // 3-1- can pass nothing now
//    sayThingsVararg("Hey")
//    sayThingsVararg("Hey", "thing1", "thing2")
//
//    // 3-2- Cannot pass list, unless we cast it to array and use, the spread operator * (which is not pointer operator as in C/C++, Kotlin doesn't have pointers)
//    sayThingsVararg("Hello", *things.toTypedArray())
//
//    // 4- Default value parameter.
//    namedArgsGreeting(greeting = "Hello")
//    namedArgsGreeting()
//
//    // 5- named arguments
//    namedArgsGreeting("name1", "Hey there")
//
//    // with named arg we can also change the arguments order
//    namedArgsGreeting(name = "name1", greeting = "Hello" )
//    namedArgsGreeting(greeting = "Hello", name = "name1")
}
