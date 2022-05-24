package p7_classes_enums_sealedclass_dataclass

class CustomPersonInfo : AbsBasePersonInfo() {

    // 1- Using Enum
    override fun getPersonCountry(): PersonCity {
        return PersonCity.BARCELONA
    }
}