package p9_scope_functions

fun main() {
    // 1- streams
    val persons = listOf(
        Person(),
        Person("Name1", "a lastname"),
        Person("Name two", "other lastname"),
        Person("Other name", "last lastname"),
        null
    )

    // We can also use streams

    // 1- filter
    val personsFiltered = persons
        .filterNotNull()
        .filter {
            it.firstName.startsWith("N")
        }

    personsFiltered.forEach {
        println(it.firstName)
    }

    // 2- map
    val lengths = personsFiltered
        .map {
            it.firstName.length
        }

    println(lengths)

    // 3- find in list (finds first) and findLast finds the last one
    println("first name in list starting with N: " +
        personsFiltered.find {
            it.firstName.startsWith("N")
        }?.firstName
    )

    // 4 - collect map
    val firstNameToLastNameLength = persons
        .filterNotNull()
        .associate {
            it.firstName to it.lastName.length
        }

    firstNameToLastNameLength.forEach {
        println("for person with name ${it.key} the lastname length is ${it.value}")
    }



}