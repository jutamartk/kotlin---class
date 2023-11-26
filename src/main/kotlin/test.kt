open class Lion(
    val name: String,
    val origin: String
) {
    open fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name, "India") {
    override fun sayHello() {
        println("says: whiuu")
    }
}

fun main() {
    val lion: Lion = Asiatic("Rufo")                              // 2
    lion.sayHello()
}