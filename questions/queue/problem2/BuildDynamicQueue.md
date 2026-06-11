# Dynamic Queue Implementation Problem

You are required to create a **Dynamic Queue** that mimics the behavior of `java.util.Queue` and follows **FIFO (First-In-First-Out)** semantics.

Unlike a fixed-size queue, this queue should automatically grow when it becomes full.

## Functions to Implement

### a) add
- Accept a new integer element and insert it at the rear of the queue.
- If the underlying array is full:
    - Create a new array with **twice the capacity** of the current array.
    - Copy all existing queue elements into the new array while maintaining FIFO order.
    - Continue the insertion.
- No overflow condition should occur.

### b) remove
- Remove and return the front element of the queue.
- If the queue is empty, print:

```text
Queue underflow
```

and return `-1`.

### c) peek
- Return the front element without removing it.
- If the queue is empty, print:

```text
Queue underflow
```

and return `-1`.

### d) size
- Return the number of elements currently present in the queue.

### e) display
- Print all queue elements in FIFO order.
- Elements should be space-separated and followed by a newline.

## Notes

- Data type will be **Integer** only.
- Queue should internally use an **array-based circular queue** implementation.
- Whenever the queue becomes full, its capacity must automatically increase to **2 × current capacity**.
- The relative order of existing elements must remain unchanged after resizing.

---

## Sample Input

```text
5
add 10
add 20
add 30
display
size
```

## Sample Output

```text
10 20 30
3
```

---

## Example of Dynamic Resizing

Assume the initial capacity of the queue is **3**.

### Operations

```text
add 10
add 20
add 30
add 40
display
```

### What Happens?

- After inserting `10`, `20`, and `30`, the queue becomes full.
- Before inserting `40`, create a new array of capacity `6`.
- Copy all existing elements in FIFO order into the new array.
- Insert `40`.

### Output

```text
10 20 30 40
```