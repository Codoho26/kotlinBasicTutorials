package p7_classes_enums_sealedclass_dataclass

abstract class AbsBasePersonInfo {

    // 1- using when
    fun printPersonCountry(city: PersonCity) {
        when(city) {
            PersonCity.BARCELONA -> println("custom person city is set to ${PersonCity.BARCELONA} and ${PersonCity.BARCELONA.description}")
            PersonCity.BERLIN -> println("custom person city is set to ${PersonCity.BERLIN} and ${PersonCity.BERLIN.description.uppercase()}")
            PersonCity.VIENNA -> println("custom person city is set to ${PersonCity.VIENNA} and ${PersonCity.VIENNA.description}")
        }
    }

    fun getHeightType(city: PersonCity): PersonCitySealed {
        return when (city) {
            PersonCity.BARCELONA -> PersonCitySealed.Barcelona("Barcelona")
            PersonCity.BERLIN -> PersonCitySealed.Berlin("Berlin")
            PersonCity.VIENNA -> PersonCitySealed.Vienna("Vienna", "Austria")
        }
    }

    abstract fun getPersonCountry(): PersonCity
}