package p6_classes_companionobject

class CustomPersonInfo(personName: String) : AbsBasePersonInfo(personName) {
    override fun greetings() {
        println("Here is the implementation of the abstract class, with greetings from $personName")
    }

    // 1- companion objects are similar to static classes in Java
    companion object FixedFeatures {
        fun getInfoType() = "General Info"
        fun getMaxCapacity() = 20
    }
}