# Linked List Basics

## Problem Statement

Implement a singly linked list that supports the following commands:

- `add` – Add an element to the end of the list.
- `first` – Display the first element.
- `last` – Display the last element.
- `index` – Display the element at a given index.
- `display` – Display all elements in the list in the format `value -> value -> ... -> null`.
- `quit` – Exit the program.

The program should continue accepting commands until `quit` is entered.

### Sample Input

```text
add 10
add 20
add 30
display
first
last
index 1
quit
```

### Sample Output

```text
10 -> 20 -> 30 -> null
10
30
20
```