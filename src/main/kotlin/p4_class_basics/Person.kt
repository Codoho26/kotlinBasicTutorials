package p4_class_basics

// 1- Kotlin has primary and secondary constructors.
// Primary constructor is specified right away as arguments
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

// 1.1 - secondary constructor:
// NOTE: if a field (already initialized in primary ctor) is to be re-initialized in secondary ctor, the field needs
//// to be defined as mutable, i.e. using "var"
//class Person {
//    var firstName: String
//    val lastName: String
//    var city: String
//
//    // Primary constructor
//    constructor(firstName: String, lastName: String, city: String = "MyCity") {
//        this.firstName = firstName
//        this.lastName = lastName
//        this.city = city
//    }
//
//    // A secondary constructor
//    constructor(firstName: String) : this(firstName, "", "default city") {
//        this.firstName = firstName
//    }
//
//}

//// 2- the fields can be defined in Ctor arguments directly.
//class Person(val firstName: String, val lastName: String = "myLastName", var city: String = "myCity") {
//
//}


//// 3- field custom getter setters
//class Person(firstName: String, val lastName: String = "myLastName", city: String = "MyCity") {
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
//class Person(private val firstName: String, private val lastName: String = "myLastName", val city: String = "myCity") {
//    fun printDetails(): String {
//        return "person is $firstName $lastName from city of $city"
//    }
//}
//
//// 5- extending class functionality
//// Note: to access the fields they need to be public
//fun Person.greeting(): String {
//    return "Greeting from extended function of the city $city"
//}