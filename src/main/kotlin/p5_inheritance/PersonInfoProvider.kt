package p5_inheritance

interface PersonInfoProvider {
    val personProviderType: String

    // default method, which can also be overridden in derived classes
    fun printPersonProviderType() {
        println(personProviderType)

    }

    fun printInfo(person: Person)
}

