package list

import Queue

class ArrayListQueue<T : Any> : Queue<T> {
    private val list = arrayListOf<T>()

    override val count: Int
        get() = list.size

    override fun peek(): T? = list.getOrNull(0)
}