package p8_higherorder_functions

class PersonFilter {

     // 1- list without allowing for Null values
    fun filterByName(persons: List<Person>, filterPredicate: (Person) -> Boolean) {
        persons.forEach {
            if (filterPredicate(it)) {
                println("${it.firstName} ${it.lastName}")
            }
        }
    }

    // 2- Handling Null values
    fun filterByNameNullable(persons: List<Person?>, filterPredicate: ((Person) -> Boolean)?) {
        persons.forEach {
            if (it?.let { it1 -> filterPredicate?.invoke(it1)} == true) {
                println("${it.firstName} ${it.lastName}")
            }
        }
    }
}