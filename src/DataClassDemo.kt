import java.time.LocalDateTime

data class FileContent(val name: String,
                       val date: LocalDateTime,
                       val content: String)

fun main(args: Array<String>) {
    val obj1 = FileContent("name", LocalDateTime.now(), "")
    val clone = FileContent(obj1.name, obj1.date, obj1.content)
    println(obj1 == clone) //true
    println(obj1 === clone) //false

    val obj2 = obj1.copy()

    println(obj2 == clone) //true
    println(obj2 === clone) //false
}
