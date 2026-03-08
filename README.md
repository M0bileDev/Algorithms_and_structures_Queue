# Queue 📬

A Kotlin implementation of **Queue** data structure with multiple backing storage strategies.

> 📚 Built as a learning project following the **Data Structures & Algorithms in Kotlin** book by Kodeco (Ray Wenderlich).

---

## Features

- 📥 **Enqueue** — add elements to the back of the queue
- 📤 **Dequeue** — remove and return elements from the front of the queue
- 👀 **Peek** — inspect the front element without removing it
- 📋 **ArrayList-Based Queue** — simple implementation backed by an ArrayList
- 🔗 **LinkedList-Based Queue** — implementation using a linked list for O(1) dequeue
- 🔄 **Ring Buffer Queue** — fixed-size circular buffer implementation
- 📚 **Double-Stack Queue** — queue built from two stacks for amortized O(1) operations

---

## Tech Stack

| Technology | Usage |
|---|---|
| Kotlin | Implementation language |
| Gradle (Kotlin DSL) | Build system |

---

## Requirements

- JDK 8+
- Gradle

---

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/M0bileDev/Algorithms_and_structures_Queue.git
   ```

2. Run the project:
   ```bash
   ./gradlew run
   ```

> **Note:** The default branch is `dev`.

---

## Purpose

This project was developed as a hands-on learning exercise to practice queue fundamentals in Kotlin, comparing different implementation strategies and their performance trade-offs (ArrayList, LinkedList, Ring Buffer, Double Stack).
