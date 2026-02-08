import doublestack.StackQueue
import linkedlist.LinkedListQueue
import list.ArrayListQueue
import ringbuffer.RingBufferQueue

fun main() {

    "Queue with ArrayList" example {
        val queue = ArrayListQueue<String>().apply {
            enqueue("Ray")
            enqueue("Brian")
            enqueue("Eric")
        }
        println(queue)
        queue.dequeue()
        println(queue)
        println("Next up: ${queue.peek()}")
    }

    "Queue with Doubly Linked List" example {
        val queue = LinkedListQueue<String>().apply {
            enqueue("Orange")
            enqueue("Apple")
            enqueue("Cherry")
        }
        println(queue)
        queue.dequeue()
        println(queue)
        println("Next up: ${queue.peek()}")
    }

    "Queue with Ring Buffer" example {
        val queue = RingBufferQueue<String>(2)
        println(queue)
        queue.enqueue("Brown")
        println(queue)
        queue.enqueue("Red")
        println(queue)
        queue.dequeue()
        println(queue)
        queue.dequeue()
        println(queue)
        queue.enqueue("Brown")
        println(queue)
        queue.enqueue("Red")
        println(queue)
        queue.enqueue("White")
        println(queue)
        queue.dequeue()
        println(queue)
        queue.enqueue("White")
        println(queue)
        println("Next up: ${queue.peek()}")
        println("Next up: ${queue.count}")
    }

    "Queue with Double Stack" example {
        val queue = StackQueue<String>().apply {
            enqueue("Ray")
            enqueue("Brian")
            enqueue("Eric")
        }
        println(queue)
        queue.dequeue()
        println(queue)
        queue.dequeue()
        println(queue)
        println("Next up: ${queue.peek()}")
    }
}

infix fun String.example(function: () -> Unit) {
    println("\n=== Example of $this ===")
    function()
}