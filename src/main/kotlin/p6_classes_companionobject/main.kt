package p6_classes_companionobject

fun main() {
    // 1- Companion object
    val customPerson = CustomPersonInfo("Faraz")
    customPerson.greetings()
    println("Here are the fixed features, i.e. info type: ${CustomPersonInfo.getInfoType()} and max capacity: ${CustomPersonInfo.getMaxCapacity()}")
}