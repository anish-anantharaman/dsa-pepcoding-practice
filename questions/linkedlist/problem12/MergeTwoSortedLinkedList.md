# Merge Two Sorted Linked Lists

## Problem

You are given two singly linked lists, each already sorted in
ascending order. Implement a `mergeTwoSortedLists` function that merges
them into a **new** sorted linked list containing all elements of both
lists.

> **Note:** The original two linked lists must remain unchanged after
> the merge.

## Constraints

- O(n) time complexity
- Constant (O(1)) extra space complexity — reuse existing nodes/values,
  do not build the result using auxiliary arrays/lists

## Sample Input

```
5
10 20 30 40 50
10
7 9 12 15 37 43 44 48 53 56
```

- Line 1: size of the first list
- Line 2: elements of the first list
- Line 3: size of the second list
- Line 4: elements of the second list

## Sample Output

```
7 9 10 12 15 37 40 43 44 48 50 52 56
10 20 30 40 50
7 9 12 15 37 43 44 48 52 56
```

- Line 1: the merged sorted list
- Line 2: the first list (unchanged)
- Line 3: the second list (unchanged)