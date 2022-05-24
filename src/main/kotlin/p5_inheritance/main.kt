package p5_inheritance

fun main() {
    // 1- inheritance basics
    // 1-1-
    val person = Person("name1", "a lastname", "Barcelona")
    val basePerson = BasePersonInfo()
    basePerson.printPersonProviderType()
    basePerson.printInfo(person)

//    // 1-2 Anonymous class implementation
//    val anonymousPerson = object : PersonInfoProvider {
//        override val personProviderType: String
//            get() = "Anonymous person"
//
//        override fun printInfo(person: Person) {
//            println("An introduction message from $personProviderType: ")
//            println("$personProviderType: ${person.printDetails()}")
//        }
//    }
//    val person = Person("no name", "no last name", "noCity")
//    anonymousPerson.printInfo(person)

}