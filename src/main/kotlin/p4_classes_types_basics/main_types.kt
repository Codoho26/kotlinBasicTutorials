package p4_classes_types_basics

fun main() {
    // 1-1- Types in Java

    // NOTE: nullable types are different from the plain types. e.g. Int is different type than Int? (nullable)
    // e.g. Nothing --> Int --> Any  --- and --- Nothing? --> Int? --> Any?
    // Nothing --> String --> Any    --- and --- Nothing? --> String? --> Any?
    // Nothing --> MutableList<T> --> List<T> --> Any --- and --- Nothing? --> MutableList<T>? --> List<T>? --> Any?

    val strNullable : String? = null
//    val str : String = strNullable ---> compile error: because String? is not same as String (String? has the parent Any? and String has the parent Any)
}