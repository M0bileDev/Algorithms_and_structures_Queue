package ringbuffer

import Queue

class RingBufferQueue<T : Any>(size: Int) : Queue<T> {
    private val ringBuffer = RingBuffer<T>(size)

    override val count: Int = ringBuffer.count

    override fun enqueue(element: T): Boolean {
        return ringBuffer.write(element)
    }

    override fun dequeue(): T? {
        return if (isEmpty) null else ringBuffer.read()
    }

    override fun peek(): T? = ringBuffer.first

    override fun toString(): String {
        return ringBuffer.toString()
    }

}