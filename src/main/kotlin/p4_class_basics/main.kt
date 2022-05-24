package p4_class_basics

fun main() {
    // 1 & 2- Different Class definition
    val person = Person("name1", "a lastname")
    println("person ${person.firstName} ${person.lastName} with city ${person.city}" )
    person.city = "Barcelona"
    println("person changed city to ${person.city} ")

//    // 3- custom setters and getters
//    val person = Person(firstName = "name1", lastName = "a lastname")
//    person.firstName
//    person.city = "Barcelona"

//    // 4- class method
//    val person = Person("name1", "a lastname", "Barcelona")
//    println(person.printDetails())

//    // 5 extended class functionality
//    println(person.greeting())
}