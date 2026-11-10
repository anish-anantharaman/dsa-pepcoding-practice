# Queue To Stack Adapter (Push Efficient)

## Problem

You are given a partially written `QueueToStackAdapter` class. Complete the body of the `push`, `pop`, `top`, `size` and `display` functions. The functions are expected to make the class behave like a **stack** (LIFO: last in, first out), using only the operations of a **queue** (FIFO: first in, first out) internally.

The adapter must be **push efficient**: the `push` function simply adds the element to the queue in constant time, and the `pop` and `top` functions do the extra work of rearranging the elements to reach the most recently pushed one.

> **Note:** Input and output are managed for you. Only the standard queue operations (`add`, `remove`, `peek`, `size`) may be used on the underlying queue(s). The `display` function prints the elements in the order they are stored in the queue (front to back).

## Constraints

- Time complexity: `push` -> O(1), `pop` -> O(n), `top` -> O(n), `size` -> O(1), `display` -> O(n)
- Space complexity: O(n)

## Sample Input

```
push 10
push 20
push 30
display
top
pop
display
size
quit
```

- Each line is a command: `push <value>`, `pop`, `top`, `size`, `display`, or `quit` (stops the input).

## Sample Output

```
10 20 30
30
30
10 20
2
```

- Line 1: result of `display` (elements printed in queue order, from front to back)
- Line 2: result of `top` (most recently pushed element)
- Line 3: result of `pop` (removes and prints the top element)
- Line 4: result of `display` after the `pop` (queue order, front to back)
- Line 5: result of `size`
- `push` prints nothing.