package p7_classes_enums_sealedclass_dataclass

fun main() {
    // 1- Add enum class functionality
    val customPerson = CustomPersonInfo()
    customPerson.printPersonCountry(PersonCity.BARCELONA)
    customPerson.printPersonCountry(PersonCity.BERLIN)

//    // 2- Add sealed class
//    val myHeight = customPerson.getHeightType(PersonCity.BERLIN)
//    myHeight.printHeightType()

    // 3- data classes: equals and hashcode is generated by default

    // Comparing data classes
    val heightA = customPerson.getHeightType(PersonCity.BARCELONA)
    val heightB = customPerson.getHeightType(PersonCity.BARCELONA)
    val heightC = customPerson.getHeightType(PersonCity.BERLIN)

    // NOTE: in Kotlin == is equivalent of equals() in Java (it doesn't compare references but the data and variables). To compare references use ===
    println(heightA == heightB)
    println(heightA === heightB)
    println(heightA == heightC)
}