fun main(args: Array<String>) {

    val string = if (args.isNotEmpty()) {
        "nonEmpty"
    } else {
        "empty"
    }

    // Будет в Java 12
    // https://habr.com/ru/post/443464/
    val marker = when ("Foo") {
        "Foo" -> Foo()
        "Bar" -> Bar()
        else -> throw IllegalArgumentException("Unsupported")
    }

    val typeName = when (marker) {
        is Foo -> "Foo"
        is Bar -> "Bar"
        else -> "Unknown type"
    }

    println("It's $typeName")

    // Type cast
    if (marker is Foo) {
        val javaClass = marker.javaClass
        print(javaClass)
    }

    val oldStyle = TestClass()
    oldStyle.addFoo(Foo())
    oldStyle.addBar(Bar())

    val kotlinStyle = TestClass().apply {
        addFoo(Foo())
        addBar(Bar())
    }
}

internal interface Marker
class Foo: Marker
class Bar: Marker

class TestClass {
    private var foo: Foo? = null
    private var bar: Bar? = null

    fun addFoo(foo: Foo) {
        this.foo = foo
    }

    fun addBar(bar: Bar) {
        this.bar = bar
    }
}