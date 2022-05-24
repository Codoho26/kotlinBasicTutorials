package p3_collections

fun sayThings(greeting: String, things: List<String>) {
    things.forEach {
        println("$greeting to $it")
    }
}

fun main() {
    // 1- List<T> is a Collection type with different implementations
    // List provides only read-only functionalities. However, it is "mutable" (because with some casting its elements
    // can be modified). NOTE: this applies to all such Collections (List, Set, ...) which are namely non-mutable and
    // read-only but actually "not" immutable.
    val things = listOf("desk", "other thing", "chair")

    // things.add("bla") --> does not work, List has no write functionality

    things.forEach {
        println(it)
    }

//    // 2- For dynamic list we can use ArrayList<T>, which is mutable.
//    val dynamicList = ArrayList<String>()
//    dynamicList.add("first thing")
//    dynamicList.add("second thing")
//    dynamicList[1] = "modified thing"
//    dynamicList.forEach{ println(it)}
//
//    // 3- ArrayList<> implements MutableList, which has not much of difference from ArrayList itself
//    val moreThings: MutableList<String> = ArrayList()
//    moreThings.add("thing A")
//    moreThings.add("thing B")
//
//    val furtherThings = mutableListOf("desk 1", "desk 2", "char 1")
//    furtherThings.add("monitor")
//    furtherThings.forEach {
//        println(it)
//    }
//    // 4- As we can see here the compiler implementation of MutableList is ArrayList
//    when (furtherThings) {
//        is ArrayList<String> -> {
//            println("It is arrayList")
//            if (furtherThings is MutableList<String>) println("of course it is also MutableList")
//        }
//        else -> println("unknown type")
//    }
//
//    // 5- Providing list as fun argument
//    sayThings("Hello", listOf("desk", "other thing", "chair"))
}