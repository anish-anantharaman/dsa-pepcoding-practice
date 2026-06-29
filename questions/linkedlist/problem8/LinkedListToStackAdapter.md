# Stack Adapter Using Linked List

## Problem Statement

Implement a stack using a linked list.

Create a class named `LinkedListToStackAdapter` that internally uses a linked list to perform all stack operations efficiently.

Your implementation must support the following operations:

- `push <value>` – Insert an element onto the top of the stack.
- `pop` – Remove and print the top element of the stack.
- `top` – Print the top element without removing it.
- `size` – Print the number of elements currently present in the stack.
- `quit` – Exit the program.

If `pop` or `top` is performed on an empty stack, print:

```
Stack underflow
-1
```

All operations must run in **O(1)** time.

---

## Input Format

Each line contains one of the following commands:

```
push <value>
pop
top
size
quit
```

Commands will be provided one per line until `quit` is encountered.

---

## Output Format

- For every `pop` command:
    - Print the removed element.
    - If the stack is empty, print:
      ```
      Stack underflow
      -1
      ```
- For every `top` command:
    - Print the top element.
    - If the stack is empty, print:
      ```
      Stack underflow
      -1
      ```
- For every `size` command:
    - Print the current size of the stack.

---

## Notes

- Implement the stack using a **linked list**.
- The stack must follow the **LIFO (Last In, First Out)** principle.
- Use only linked list operations to implement the stack.
- All operations (`push`, `pop`, `top`, and `size`) should execute in **constant time (O(1))**.
- Do **not** use Java's built-in `Stack` class.

---

## Sample Input

```
push 10
push 20
push 30
size
top
pop
top
size
quit
```

## Sample Output

```
3
30
30
20
2
```

---

## Sample Input 2

```
pop
top
push 5
top
pop
pop
quit
```

## Sample Output 2

```
Stack underflow
-1
Stack underflow
-1
5
5
Stack underflow
-1
```

---

## Explanation

Initially, the stack is empty.

Operations performed:

```
push 10
Stack: 10

push 20
Stack: 20 -> 10

push 30
Stack: 30 -> 20 -> 10
```

- `size` prints `3`.
- `top` prints `30` without removing it.
- `pop` removes and prints `30`.
- The stack becomes:

```
20 -> 10
```

- `top` now prints `20`.
- `size` prints `2`.

If `pop` or `top` is executed on an empty stack, print:

```
Stack underflow
-1
```