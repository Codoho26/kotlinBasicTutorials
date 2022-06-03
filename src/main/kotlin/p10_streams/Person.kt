package p10_streams

// 4- class methods
class Person(var firstName: String = "myName", var lastName: String = "myLastName") {
    private var city: String = "myCity"

    fun printDetails() {
        println("person is $firstName $lastName from city of $city")
    }

    fun setCity(city: String) {
        this.city = city
    }
}
