package p9_scope_functions

// 4- class methods
class Person(val firstName: String = "myName", val lastName: String = "myLastName", private val city: String = "myCity") {
    fun printDetails(): String {
        return "person is $firstName $lastName from city of $city"
    }
}
