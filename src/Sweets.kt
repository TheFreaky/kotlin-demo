import java.time.LocalDate

fun main(args: Array<String>) {
    val s1: String? = null
    s1?.substring(5).let { "Test" }

    manyArgumentsFunction("Maxim", "K", LocalDate.MAX, true)
    manyArgumentsFunction(
        name = "Maxim",
        birthDate = LocalDate.MAX,
        surname = "K",
        gender = true
    )

    val function: (String) -> Unit = {
        println(it)
    }

    val func = TestClass::addBar

    lambdaSupport("1", function)
    lambdaSupport("2") { string -> println(string) }
    lambdaSupport("2") {
        println(it)
    }
}

fun nullVariables(): String {
    val nullableString: String? = getString()
    return nullableString?.substring(5).let { "Test" }
}

fun getString(): String? = null

fun manyArgumentsFunction(name: String, surname: String, birthDate: LocalDate, gender: Boolean) {

}

fun likeStreams() {
//    listOf(1,2,3,4,5).stream().filter({ it % 2 == 0 }).toList()
    listOf(1, 2, 3, 4, 5).filter { it % 2 == 0 }
}

fun lambdaSupport(arg: String, function: (String) -> Unit) {
    function.invoke(arg)
}

fun String.sayHello(): String {
    return "Hello $this"
}