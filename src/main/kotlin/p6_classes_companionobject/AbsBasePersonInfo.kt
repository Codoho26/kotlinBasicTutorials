package p6_classes_companionobject

abstract class AbsBasePersonInfo {
    abstract fun greetings()

    // 1-
    fun defaultGreeting() {
        println("hello from abstract class")
    }
}