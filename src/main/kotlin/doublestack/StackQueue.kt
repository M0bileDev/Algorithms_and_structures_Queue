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

class StackImpl<T : Any> : Stack<T> {
    private val storage = arrayListOf<T>()

    override fun toString() = buildString {
        appendLine("----top----")
        storage.asReversed().forEach {
            appendLine("$it")
        }
        appendLine("-----------")
    }

    override fun push(element: T) {
        storage.add(element)
    }

    override fun pop(): T? {
        if (isEmpty) {
            return null
        }
        return storage.removeAt(count - 1)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    override val count: Int
        get() = storage.size

    companion object {
        fun <T : Any> create(items: Iterable<T>): Stack<T> {
            val stack = StackImpl<T>()
            for (item in items) {
                stack.push(item)
            }
            return stack
        }
    }
}

fun <T : Any> stackOf(vararg elements: T): Stack<T> {
    return StackImpl.create(elements.asList())
}

class StackQueue<T : Any> : Queue<T> {
    private val dequeueStack = StackImpl<T>()
    private val enqueueStack = StackImpl<T>()

    override val count: Int
        get() = enqueueStack.count + dequeueStack.count

    override val isEmpty: Boolean
        get() = enqueueStack.isEmpty && dequeueStack.isEmpty

    override fun enqueue(element: T): Boolean {
        enqueueStack.push(element)
        return true
    }

    override fun dequeue(): T? {
        TODO("Not yet implemented")
    }

    override fun peek(): T? {
        if (dequeueStack.isEmpty) {
            transferElements()
        }
        return dequeueStack.peek()
    }

    private fun transferElements() {
        var nextElement = enqueueStack.pop()
        while (nextElement != null) {
            dequeueStack.push(nextElement)
            nextElement = enqueueStack.pop()
        }
    }
}
