package ringbuffer

import Queue

class RingBufferQueue<T : Any>(size: Int) : Queue<T> {
    private val ringBuffer = RingBuffer<T>(size)

    override val count: Int = ringBuffer.count

    override fun enqueue(element: T): Boolean {
        return ringBuffer.write(element)
    }

    override fun dequeue(): T? {
        TODO("Not yet implemented")
    }

    override fun peek(): T? = ringBuffer.first

}