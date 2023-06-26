package introduce

fun introduce(init: PersonBuilder.() -> Unit): Person {
    val personBuilder = PersonBuilder()
    personBuilder.init()
    return personBuilder.build()
}
