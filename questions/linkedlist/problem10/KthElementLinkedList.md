# LinkedList Kth element from the end

## Problem

Implement a singly linked list that supports the following commands,
entered one at a time until "quit" is received:

| Command | Description                                  |
|---------|-----------------------------------------------|
| `add`   | Add a new value to the end of the list        |
| `kth`   | Accept an integer `k` and display the value **k nodes from the end** (0-based, `k = 0` → last node) |
| `quit`  | End the program                               |

> **Note:** For the `kth` command, do **not** use the size/length of the
> list directly or indirectly. The list must be traversed **iteratively**,
> and in a **single traversal** (no multi-pass), to find the answer.

## Example Input

```
add 10
add 20
add 30
add 40
add 50
kth 2
quit
```

## Expected Output

```
30
```