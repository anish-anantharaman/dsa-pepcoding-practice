# Reverse a Linked List (Data Iterative)

## Problem Statement

Implement a singly linked list that supports the following commands:

- `add <value>` – Insert an element at the end of the linked list.
- `reverse` – Reverse the linked list by swapping the **data values** of nodes. Do not modify the links between nodes.
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

## Notes

- The `reverse` operation must be implemented **iteratively**.
- Reverse the list by **swapping the data values of nodes only**.
- Do **not** change the node connections (`next` pointers).
- Do **not** create a new linked list.

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