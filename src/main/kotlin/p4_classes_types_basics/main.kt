package p4_classes_types_basics

fun main() {
    // 1, 1.1 & 2- Different Class definition
    val person = Person("name1", "a lastname")
    println("person ${person.firstName} ${person.lastName} with city ${person.city}" )
    person.city = "Barcelona"
    println("person changed city to ${person.city} ")

//    // 1-2- equals and hashcode, which is the same for all primitive type objects in Kotlin, i.e. String, Int, ...
//    // NOTE: for Float and Double, in exceptional cases (e.g. -0.0f compared to 0.0f), .equals() doesn't give correct response whereas == and === do give
//    // the correct answer.
//    val i1 = 2
//    val i2 = 2
//    println(i1 == i2)
//    println(i1 === i2)
//    println(i1.equals(i2))

//    val f1 = -0.0f
//    val f2 = 0.0f
//    println(f1 == f2)
//    println(f1.equals(f2))
//    println(f1 === f2)

//    // For classes: for a normal class equals and hashcode need to be overridden for correct comparison. Here we
//    // haven't overridden equals and Hashcode so...
//    val person1 = Person("name1", "a lastname")
//    val person2 = Person("name1", "a lastname")
//    println(person1 == person2)
//    println(person1.equals(person2))
//    println(person1 === person2)

//    // But, for a data class the equals and hashcode are already implemented. So, ...
//    val pd1 = PersonData("n1", "l1")
//    val pd2 = PersonData("n1", "l1")
//    println(pd1 == pd2)
//    println(pd1.equals(pd2))
//    println(pd1 === pd2)


//    // 2-
//    val person2 = Person("myName")
//    println("person ${person2.firstName} ${person2.lastName} with city ${person2.city}" )

//    // 3- custom setters and getters
//    val person = Person(firstName = "name1", lastName = "a lastname")
//    person.firstName
//    person.city = "Barcelona"

//    // 4- class method
//    val person = Person("name1", "a lastname", "Barcelona")
//    println(person.printDetails())
//
//    // 5 extended class functionality
//    println(person.greeting())
}