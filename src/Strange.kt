import java.math.BigDecimal
import java.util.stream.Collectors

data class User(val name: String,
                val password: String)


fun main(args: Array<String>) {
//    7 sayHello "Max"
    7.sayHello("Max")



    val money = BigDecimal(100)
    val money2 = 100.bd



    val users = arrayOf(User("Vasya", "123"), User("Alex", "Qwerty"), User("Igor", "password"))

    val sorted = users.filter { it.password != "123" }
        .sortedBy { it.name }
        .map { it.name to it.password }

//    List<Pair<String, String>> sorted = users.stream()
//        .filter(user -> !user.password.equals("123"))
//        .sorted(Comparator.comparing(User::getName))
//        .map(user -> new Pair<>(user.getName(), user.getPassword()))
//        .collect(Collectors.toList());


    val sortedMap = users.filter { it.password != "123" }
        .sortedBy { it.name }
        .map { it.name to it.password }
        .toMap()
//    Map<String, String> map = users.stream()
//        .filter(user -> !user.password.equals("123"))
//        .sorted(Comparator.comparing(User::getName))
//        .collect(Collectors.toMap(User::getName, User::getPassword));

    print(sorted)
}

private val Int.bd: BigDecimal
    get() = BigDecimal(this)

infix fun Int.sayHello(name: String) = println("Hello, $name! From $this")