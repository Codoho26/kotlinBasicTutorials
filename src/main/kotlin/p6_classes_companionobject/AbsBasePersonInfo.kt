package p6_classes_companionobject

abstract class AbsBasePersonInfo(val personName: String) {
    abstract fun greetings()

    // 1-
    fun defaultGreeting() {
        println("hello from abstract class")
    }
}