# Queue To Stack Adapter (Pop Efficient)

## Problem

You are given a partially written `QueueToStackAdapter` class. Complete the body of the `push`, `pop`, `top`, `size` and `display` functions. The functions are expected to make the class behave like a **stack** (LIFO: last in, first out), using only the operations of a **queue** (FIFO: first in, first out) internally.

The adapter must be **pop efficient**: the `push` function does the extra work of rearranging the elements, so that `pop` and `top` can run in constant time.

> **Note:** Input and output are managed for you. Only the standard queue operations (`add`, `remove`, `peek`, `size`) may be used on the underlying queue(s).

## Constraints

- Time complexity: `push` -> O(n), `pop` -> O(1), `top` -> O(1), `size` -> O(1), `display` -> O(n)
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
30 20 10
30
30
20 10
2
```

- Line 1: result of `display` (elements printed from the top of the stack to the bottom)
- Line 2: result of `top` (most recently pushed element)
- Line 3: result of `pop` (removes and prints the top element)
- Line 4: result of `display` after the `pop`
- Line 5: result of `size`
- `push` prints nothing.