# Linked List Operations: Add at Last and Remove at Index

## Problem Statement

Implement a singly linked list that supports the following commands:

* `add <value>` – Insert an element at the end of the linked list.
* `remove <index>` – Remove the element at the specified index.
* `display` – Print all elements in the list in the format `value -> value -> ... -> NULL`.
* `quit` – Exit the program.

## Rules

### Add Operation

* New elements should always be inserted at the end of the list.

### Remove Operation

* Indexing starts from `0`.
* If the list is empty, print `"List is empty"` and print `-1`.
* If the index is invalid (negative or greater than or equal to the size of the list), print `"Invalid argument"` and print `-1`.
* If `index == 0`, remove the first element.
* Otherwise, remove the node at the specified index.
* * After a successful removal, print the value that was removed.

### Display Operation

* Print the linked list in the format:

```text
10 -> 20 -> 30 -> NULL
```

* If the list is empty, print:

```text
NULL
```

The program should continuously accept commands until `quit` is entered.

---

## Sample Input

```text
add 10
add 20
add 30
display
remove 1
display
remove 5
quit
```

## Sample Output

```text
10 -> 20 -> 30 -> NULL
20
10 -> 30 -> NULL
Invalid argument
-1
```

---

## Example Explanation

```text
add 10      -> List: 10
add 20      -> List: 10 -> 20
add 30      -> List: 10 -> 20 -> 30
remove 1    -> Removes 20
display     -> 10 -> 30 -> NULL
```

### Constraints

* Number of operations ≤ 10,000
* Values are integers.
* Use a singly linked list implementation.
