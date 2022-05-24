package p5_inheritance

// 1-
class BasePersonInfo : PersonInfoProvider {
    override val personProviderType: String = "Base person"

    override fun printInfo(person: Person) {
        println("For $personProviderType: ${person.printDetails()}")
    }
}


//// 2- In Kotlin the classes are by default final, so cannot be extended.
//// Need to change the access modifier to open in order to allow it for extension
//open class BasePersonInfo : PersonInfoProvider {
//    override val personProviderType: String
//        get() = "Base person provider type"
//
//    override fun printInfo(person: Person) {
//        println("Printing person ${person.firstName} ${person.lastName} Info from provider")
//    }
//}