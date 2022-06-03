package p10_streams

fun main() {

    // 1- let: Most commonly used. It is used for null checks in Kotlin.
    val ma = MainActivity(2, 3)
    ma.useNum()

    // 2- also
    println(ma.getSquareAndIncreaseCount1())
    println(ma.cnt) // Indeed, increased cnt
    println(ma.getSquareAndIncreaseCount2()) // doesn't increase it by 1 though

    ma.getPersonInfoUpdated(Person()) // also: Note it only returns the object that it was called on, not the modification on the object!

    // 3- apply
    val person = ma.applyPersonDetails()
    person.printDetails()

    // 4- run
    println(ma.runPersonDetails())

    // 5- with
    // is similar to "run"

}