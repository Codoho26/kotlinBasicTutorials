package p7_classes_enums_sealedclass_dataclass

// Note: sealed classes are similar to the standard abstract/interface classes, but the derived classes must all be known
// at compile time (also when used as third-party libs, the users cannot extend sealed classes).
// Key difference from Enum is that the derived classes can have different properties and methods.

sealed interface PersonCitySealed {
    fun printHeightType()

    data class Barcelona(private val description: String) : PersonCitySealed {
        override fun printHeightType() {
            println("city description is $description from Barcelona class")
        }
    }
    data class Berlin(private val description: String) : PersonCitySealed {
        override fun printHeightType() {
            println("$description from Berlin class")
        }
    }

    // derived classes can even be different type of class with different properties (data class with an extra argument)
    data class Vienna(val description: String, val country: String) : PersonCitySealed {

        override fun printHeightType() {
            println("$description is in $country ")
        }
    }
}