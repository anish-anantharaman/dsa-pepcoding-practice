# Stack To Queue Adapter (Add Efficient)

## Problem

You are required to complete the code of the `StackToQueueAdapter` class. The class should mimic the behaviour of a **queue** (FIFO: first in, first out) using the operations of a **stack** (LIFO: last in, first out) internally.

The following functions are written in the class:

- `add` -> Accepts new data if there is space available in the underlying array, or prints `"Queue overflow"` otherwise.
- `remove` -> Removes and returns the value according to FIFO, if available. Otherwise prints `"Queue underflow"` and returns `-1`.
- `peek` -> Returns the value according to FIFO, if available. Otherwise prints `"Queue underflow"` and returns `-1`.
- `size` -> Returns the number of elements available in the queue.

The adapter must be **add efficient**: the `add` function simply pushes the element onto the stack in constant time, and the `remove` and `peek` functions do the extra work of rearranging the elements to reach the element that was added first.

> **Note:** Input and output are managed for you.

## Constraints

- Time complexity: `add` -> O(1), `remove` -> O(n), `peek` -> O(n), `size` -> O(1)
- Space complexity: O(n)

## Sample Input

```
add 10
add 20
add 30
add 40
add 50
remove
remove
add 60
add 70
peek
size
quit
```

- Each line is a command: `add <value>`, `remove`, `peek`, `size`, or `quit` (stops the input).

## Sample Output

```
10
20
30
5
```

- Line 1: result of the first `remove` (front of the queue)
- Line 2: result of the second `remove`
- Line 3: result of `peek` (current front of the queue)
- Line 4: result of `size`
- `add` prints nothing, unless the queue is full, in which case it prints `Queue overflow`.
- `remove` and `peek` print `Queue underflow` when the queue is empty.