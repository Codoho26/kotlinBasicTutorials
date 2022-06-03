package p10_streams

import java.time.Period

class MainActivity(var numField: Int? = null, var cnt: Int = 1, val person: Person? = null) {

    fun useNum() {
        // 1- If we use it like this, doesn't compile. Because it says the value of numField might have been changed, to Null,
        // (by another thread) at the time we want to access it!

//        if (numField != null) {
//            val numLocal = numField + 1
//        }

        // 1-1 So, in some way we should make sure it is not null
        // Solution: let keyword.
        // Now if another thread changes numLField when we access it, the let block won't let its value get
        // affected by that change

        numField?.let {
            val numLocal = it + 1
        }

        // 1-2 we can also assign it to a variable outside
        val numLocal = numField?.let {
            it + 1
        }

        // 1-3 we can also check if the let value becomes null we can assign something else
        val numLocal2 = numField?.let {
            it + 1
        } ?: 4

        val person2 = person?.let {
            it.firstName = "Faraz"
            it.lastName = "Khatami"
        } ?: Person()

        val a = 1
    }

    // 2- "also" function
    // it is very similar to let. But the difference is that it returns the object it was called on

    fun getSquareAndIncreaseCount1() = (cnt * cnt).also {
        cnt++ // Note: it will still return cnt*cnt and not cnt++!
    }

    fun getSquareAndIncreaseCount2() = (cnt * cnt).also {
        it + 1 // refers to cnt*cnt. Note: it doesn't increase the "it" by 1, because "also" only returns the object, which in this case is "it" and not "it + 1"
    }


    // Note, it returns the object (not the last line)
    fun getPersonInfoUpdated(personLoc: Person?) {
        println(
            personLoc?.also {
                println("also: updating person object's name field ${it.firstName}, which becomes:")
                it.firstName += " secondFirstName"
                val greet = "hello bla"
            }?.firstName
        )
    }

    // Difference between let and also
    fun differenceOfLetAndApply() {
        // Here is difference between let and also:
        // let returns only the last line, but also, returns the object it was called on!
        val person3 = person?.let {
            it.firstName = "Faraz"
            it.lastName = "Khatami"
            "bla"
        }

        val person33 = person?.also {
            it.firstName = "Faraz"
            it.lastName = "Khatami"
            "bla"
        }
    }

    // 3- "apply"
    // We can create a scope and apply the properties for a object of type we want without needing to do things like
    // e.g. person1.firstName = "..." then person1.setCity(..) etc
    fun applyPersonDetails(): Person {
        val person1 = Person().apply {
            firstName = "Faraz"
            lastName = "Khatami"
            setCity("Barcelona")
        }

        return person1
    }

    // 4- "run"
    // will not return the object it was called on but it will return the last line only (so "apply" in general is
    // better function than "run")
    fun runPersonDetails(): String {
        val str = Person().run {
            firstName = "Faraz"
            lastName = "Khatami"
            setCity("Barcelona")
            "run doesn't return the object but the last line, return type is now not Person, but String"
        }

        return str
    }

}