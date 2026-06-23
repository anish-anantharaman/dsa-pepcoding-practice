# Reverse a Linked List (Pointer Iterative)

## Problem Statement

Implement a singly linked list that supports the following commands:

- `add <value>` – Insert an element at the end of the linked list.
- `reverse` – Reverse the linked list iteratively by changing the node links (`next` pointers).
- `display` – Print all elements of the linked list in the format:

  ```
  value -> value -> value -> NULL
  ```

- `quit` – Exit the program.

---

## Input Format

Each line contains one of the following commands:

```
add <value>
reverse
display
quit
```

Commands will be provided one per line until `quit` is encountered.

---

## Output Format

For every `display` command, print the contents of the linked list in the format:

```
value -> value -> value -> NULL
```

If the list is empty, print:

```
NULL
```

---

## Notes

- The `reverse` operation must be implemented **iteratively**.
- Reverse the linked list by updating the `next` pointers of the nodes.
- Do **not** swap the data values stored in the nodes.
- Do **not** create a new linked list.
- After reversal, the head of the list should point to the former last node.

---

## Sample Input

```
add 10
add 20
add 30
add 40
display
reverse
display
quit
```

## Sample Output

```
10 -> 20 -> 30 -> 40 -> NULL
40 -> 30 -> 20 -> 10 -> NULL
```

---

## Sample Input 2

```
display
add 5
reverse
display
quit
```

## Sample Output 2

```
NULL
5 -> NULL
```

---

## Explanation

Original list:

```
10 -> 20 -> 30 -> 40 -> NULL
```

During reversal, the links between nodes are changed:

```
10 <- 20 <- 30 <- 40
```

The new head becomes `40`, resulting in:

```
40 -> 30 -> 20 -> 10 -> NULL
```

The node data remains unchanged; only the `next` pointers are modified.