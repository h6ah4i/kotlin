open class SetStringImpl {
    fun add(s: String): Boolean = false
    fun remove(o: Any?): Boolean = false
    fun clear(): Unit {}
}

class S : Set<String>, SetStringImpl() {
    override val size: Int get() = 0
    override val isEmpty: Boolean get() = true
    override fun contains(o: String): Boolean = false
    override fun iterator(): Iterator<String> = null!!
    override fun containsAll(c: Collection<String>) = false
}

fun box(): String {
    val s = S() as java.util.Set<String>
    s.add("")
    s.remove("")
    s.clear()
    return "OK"
}
