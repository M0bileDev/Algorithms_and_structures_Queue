package doublestack

import Queue

interface Stack<T : Any> {
    fun push(element: T)

    fun pop(): T?

    fun peek(): T?

    val count: Int

    val isEmpty: Boolean
        get() = count == 0
}

class StackQueue<T: Any> : Queue<T>{
    override val count: Int
        get() = TODO("Not yet implemented")

    override fun enqueue(element: T): Boolean {
        TODO("Not yet implemented")
    }

    override fun dequeue(): T? {
        TODO("Not yet implemented")
    }

    override fun peek(): T? {
        TODO("Not yet implemented")
    }

}
