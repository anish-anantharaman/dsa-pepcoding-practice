# LinkedList Mid-Element

## Problem

Implement a singly linked list that supports the following commands,
entered one at a time until "quit" is received:

| Command | Description                                  |
|---------|-----------------------------------------------|
| `add`   | Add a new value to the end of the list        |
| `mid`   | Display the value of the **middle node** of the list |
| `quit`  | End the program                               |

> **Note:** For the `mid` command, do **not** use the size/length of the
> list directly or indirectly (no traversal just to calculate size). The
> list must be traversed **iteratively**, and in a **single traversal**,
> to find the answer. For a list of odd size, the mid is unambiguous. For
> a list of even size, consider the **end of the first half** as the mid.

## Example Input

```
add 10
add 20
add 30
add 40
add 50
mid
quit
```

## Expected Output

```
30
```