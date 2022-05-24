package p4_class_basics

// 1- class constructor arguments and fields definition
class Person(firstName: String, lastName: String, city: String = "MyCity") {
    // fields defined via "val" are final (no setters) and if public (which it is by default here) can be accessed from
    // outside the class. So, no need to define getters and setters
    val firstName: String
    val lastName: String

    // fields defined as "var" also have setter
    var city: String

    init {
        this.firstName = firstName
        this.lastName = lastName
        this.city = city
    }

}

//// 2- if the Ctor parameter value is directly assigned to field, the field can be defined in Ctor arguments directly.
//class Person(val firstName: String = "myName", val lastName: String = "myLastName", var city: String = "myCity") {
//}


//// 3- field custom getter setters
//class Person(firstName: String = "myName", val lastName: String = "myLastName", city: String = "MyCity") {
//
//    // the field value is accessed through "field" keyword
//    val firstName: String = firstName
//        get() {
//            println("What? Someone asking me for my name?")
//            return field
//        }
//
//    // fields defined as "var" also have setter
//    var city: String? = null
//        set(newCity) {
//            println("setting city to $newCity")
//            field = newCity
//        }
//}

//// 4- class methods
//class Person(private val firstName: String = "myName", private val lastName: String = "myLastName", private val city: String = "myCity") {
//    fun printDetails(): String {
//        return "person is $firstName $lastName from city of $city"
//    }
//}

// 5- extending class functionality
fun Person.greeting(): String {
    return "Greeting from extended function"
}