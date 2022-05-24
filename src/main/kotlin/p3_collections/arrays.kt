package p3_collections

fun main() {
    // 1- Array<T> is fixed size data storage data structure
    val things: Array<String> = arrayOf("desk", "other thing", "chair")
    println(things.size)
    println(things[0])
    println(things.get(1))

    // 2- Arrays are "mutable"
    val myThings = things
    myThings[1] = "new thing"
    println(myThings[1])

    // 3- Array<T> is invariant on type T, e.g. Array<Int> is not Array<Number>
    val nums = arrayOf(1, 2, 3)
    println(nums[0])
    // val numberArr: Array<Number> = nums ---> does not work

    // 4- Iterating Array

    // 4-1 Iterating Array using for loop
    for (thing in things) {
        println(thing)
    }

    // 4-2 Iterating arrays using forEach and forEachIndexed
    // using lambda definition
    things.forEach {
        thing -> println(thing)
    }

    // 4-3 the implicit lambda prarameter "it" can be used as well (only when lambda has 1 input parameter)
    things.forEach {
        println(it)
    }

    // 4-4 - We can also iterate the indices
    things.forEachIndexed { ind, thing -> println("for index $ind this is the thing $thing") }
}