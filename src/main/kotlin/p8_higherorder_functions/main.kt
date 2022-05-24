package p8_higherorder_functions

val customFilterPredicate: (Person) -> Boolean = {
    it.firstName.startsWith("N")
}

// NOTE: the returning lambda function must be embraced with {} to be compiled as a lambda
fun customFilterPredicateFunc(): (Person) -> Boolean {
    return { it.firstName.startsWith("O") }
}

fun main() {
    // 1- defining a predicate
    val persons = listOf(
        Person(),
        Person("Name1", "a lastname"),
        Person("Name two", "other lastname"),
        Person("Other name", "last lastname")
    )
    val personFilter = PersonFilter()
    personFilter.filterByName(persons, customFilterPredicate)

//    // 2- Including null values
//    val persons = listOf(
//        Person(),
//        Person("Name1", "a lastname"),
//        Person("Name two", "other lastname"),
//        Person("Other name", "last lastname"),
//        null
//    )
//    val personFilter = PersonFilter()
//    personFilter.filterByNameNullable(persons, customFilterPredicate)
//    personFilter.filterByNameNullable(persons, null)
//    personFilter.filterByNameNullable(persons, customFilterPredicateFunc())
}