package p6_classes_companionobject

class CustomPersonInfo : AbsBasePersonInfo() {
    override fun greetings() {
        println("Here is the implementation of the abstract class")
    }

    // 1- companion objects are similar to static classes in Java
    companion object FixedFeatures {
        fun getInfoType() = "General Info"
        fun getMaxCapacity() = 20
    }
}