# Two Stacks In An Array

## Problem

You are required to complete the code of the `TwoStacks` class. The class should implement **two stacks** using a **single array**, such that neither stack overflows unless the total number of elements in both stacks together equals the size of the array. The first stack grows from the left end of the array and the second stack grows from the right end.

The following functions are written in the class:

- `push1` -> Pushes the data onto the first stack if there is space available in the underlying array, or prints `"Stack overflow"` otherwise.
- `push2` -> Pushes the data onto the second stack if there is space available in the underlying array, or prints `"Stack overflow"` otherwise.
- `pop1` -> Removes and returns the top value of the first stack, if available. Otherwise prints `"Stack underflow"` and returns `-1`.
- `pop2` -> Removes and returns the top value of the second stack, if available. Otherwise prints `"Stack underflow"` and returns `-1`.
- `top1` -> Returns the top value of the first stack, if available. Otherwise prints `"Stack underflow"` and returns `-1`.
- `top2` -> Returns the top value of the second stack, if available. Otherwise prints `"Stack underflow"` and returns `-1`.
- `size1` -> Returns the number of elements available in the first stack.
- `size2` -> Returns the number of elements available in the second stack.

> **Note:** Input and output are managed for you.

## Constraints

- Time complexity: all functions -> O(1)
- Space complexity: O(n), where `n` is the size of the underlying array

## Sample Input

```
5
push1 10
push1 20
push2 30
push2 40
push1 50
push2 60
top1
top2
pop1
pop2
size1
size2
quit
```

- Line 1: capacity of the underlying array
- Remaining lines: each line is a command: `push1 <value>`, `push2 <value>`, `pop1`, `pop2`, `top1`, `top2`, `size1`, `size2`, or `quit` (stops the input).

## Sample Output

```
Stack overflow
50
40
50
40
2
1
```

- Line 1: printed by `push2 60`, because all 5 positions of the array are already occupied
- Line 2: result of `top1` (top of the first stack)
- Line 3: result of `top2` (top of the second stack)
- Line 4: result of `pop1` (removes and prints the top of the first stack)
- Line 5: result of `pop2` (removes and prints the top of the second stack)
- Line 6: result of `size1`
- Line 7: result of `size2`
- `push1` and `push2` print nothing, unless the array is full, in which case they print `Stack overflow`.
- `pop1`, `pop2`, `top1` and `top2` print `Stack underflow` when the respective stack is empty.