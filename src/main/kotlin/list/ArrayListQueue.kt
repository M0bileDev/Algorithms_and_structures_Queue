package list

import Queue

class ArrayListQueue<T: Any>: Queue<T>{
    private val list = arrayListOf<T>()
}