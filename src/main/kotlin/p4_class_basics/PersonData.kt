package p4_class_basics

data class PersonData(val firstName: String, val lastName: String = "myLastName", var city: String = "myCity") {
}