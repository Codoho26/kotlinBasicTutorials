package p5_inheritance

// 4- class methods
class Person(private val firstName: String = "myName", private val lastName: String = "myLastName", private val city: String = "myCity") {
    fun printDetails(): String {
        return "person is $firstName $lastName from city of $city"
    }
}
