package p4_classes_types_basics

data class PersonData(val firstName: String, val lastName: String = "myLastName", var city: String = "myCity") {
}