package p5_inheritance

// 1-
class BasePersonInfo : PersonInfoProvider {
    override val personProviderType: String = "Base person"

    override fun printInfo(person: Person) {
        println("For $personProviderType: ${person.printDetails()}")
    }
}