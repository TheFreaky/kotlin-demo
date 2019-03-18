fun main(args: Array<String>) {

    val string = if (args.isNotEmpty()) {
        "nonEmpty"
    } else {
        "empty"
    }

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

    val oldStyle = TestClass()
    oldStyle.addFoo(Foo())
    oldStyle.addBar(Bar())
    oldStyle.init()

    val kotlinStyle = TestClass().apply {
        addFoo(Foo())
        addBar(Bar())
        init()
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

    fun init() {
        if (foo == null || bar == null) {
            throw IllegalStateException("Something wrong")
        }
    }
}