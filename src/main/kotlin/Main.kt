import linkedlist.LinkedListQueue
import list.ArrayListQueue

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

}

infix fun String.example(function: () -> Unit) {
    println("\n=== Example of $this ===")
    function()
}