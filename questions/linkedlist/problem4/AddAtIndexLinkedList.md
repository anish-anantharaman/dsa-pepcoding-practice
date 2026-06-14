# Add at Index in Linked List

## Problem Statement

Implement a singly linked list that supports the following commands:

- `add <index> <value>` – Insert an element at the specified index.
- `display` – Print all elements in the list in the format `value -> value -> ... -> NULL`.
- `quit` – Exit the program.

## Rules

- Indexing starts from `0`.
- If `index == 0`, insert at the beginning.
- If `index == size`, insert at the end.
- If index is invalid (negative or greater than size), print "Invalid argument" and print -1.

The program should continuously accept commands until `quit` is entered.

## Sample Input

```text
add 0 10
add 1 30
add 1 20
add 3 40
display
quit