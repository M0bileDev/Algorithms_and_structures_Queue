package ringbuffer

@Suppress("UNCHECKED_CAST")
class RingBuffer<T : Any>(private val size: Int) {

    private val array = arrayOfNulls<Any>(size)

    private var readIndex = 0
    private var writeIndex = 0
    var count = 0
        private set

    val isEmpty: Boolean
        get() = count == 0

    val isFull: Boolean
        get() = count == size

    val first: T?
        get() = if (isEmpty) null else array[readIndex] as T

    fun write(element: T): Boolean {
        if (isFull) return false

        array[writeIndex] = element
        writeIndex = (writeIndex + 1) % size
        count++

        return true
    }

    fun read(): T? {
        if (isEmpty) return null

        val element = array[readIndex] as T
        array[readIndex] = null // helps GC

        readIndex = (readIndex + 1) % size
        count--
        return element
    }

    override fun toString(): String {
        if (isEmpty) return "[],".repeat(size).removeSuffix(",")

        return buildString {
            val iterator = array.iterator()
            while (iterator.hasNext()) {
                append("[").append(iterator.next()).append("]").append(",")
            }
        }.removeSuffix(",")

    }
}