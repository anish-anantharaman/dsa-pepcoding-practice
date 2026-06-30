# Queue Adapter Using Linked List

## Problem Statement

Implement a queue using a linked list.

Create a class named `LinkedListToQueueAdapter` that internally uses a linked list to perform all queue operations efficiently.

Your implementation must support the following operations:

- `add <value>` – Insert an element at the rear of the queue.
- `remove` – Remove and print the front element of the queue.
- `peek` – Print the front element without removing it.
- `size` – Print the number of elements currently present in the queue.
- `quit` – Exit the program.

If `remove` or `peek` is performed on an empty queue, print:

```
Queue underflow
-1
```

All operations must run in **O(1)** time.

---

## Input Format

Each line contains one of the following commands:

```
add <value>
remove
peek
size
quit
```

Commands will be provided one per line until `quit` is encountered.

---

## Output Format

- For every `remove` command:
    - Print the removed element.
    - If the queue is empty, print:
      ```
      Queue underflow
      -1
      ```
- For every `peek` command:
    - Print the front element.
    - If the queue is empty, print:
      ```
      Queue underflow
      -1
      ```
- For every `size` command:
    - Print the current size of the queue.

---

## Notes

- Implement the queue using a **linked list**.
- The queue must follow the **FIFO (First In, First Out)** principle.
- Use only linked list operations to implement the queue.
- All operations (`add`, `remove`, `peek`, and `size`) should execute in **constant time (O(1))**.
- Do **not** use Java's built-in `Queue` as a queue implementation directly.

---

## Sample Input

```
add 10
add 20
add 30
size
peek
remove
peek
size
quit
```

## Sample Output

```
3
10
10
20
2
```

---

## Sample Input 2

```
remove
peek
add 5
peek
remove
remove
quit
```

## Sample Output 2

```
Queue underflow
-1
Queue underflow
-1
5
5
Queue underflow
-1
```

---

## Explanation

Initially, the queue is empty.

Operations performed:

```
add 10
Queue: 10

add 20
Queue: 10 -> 20

add 30
Queue: 10 -> 20 -> 30
```

- `size` prints `3`.
- `peek` prints `10` without removing it.
- `remove` removes and prints `10`.
- The queue becomes:

```
20 -> 30
```

- `peek` now prints `20`.
- `size` prints `2`.

If `remove` or `peek` is executed on an empty queue, print:

```
Queue underflow
-1
```