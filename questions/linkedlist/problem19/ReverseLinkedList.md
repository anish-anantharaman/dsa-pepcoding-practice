# Reverse A Linked List (Data Recursive)

## Problem

You are given a partially written `LinkedList` class. Complete the body of the `reverseDR` function. The function is expected to reverse the linked list by using recursion and changing the `data` member of the nodes.

> **Note:** Input and output are managed for you. The online judge can't force you to write a recursive function, nor can it check whether you changed the `data` member or not. But that is what is expected; the intention is to help you learn.

## Constraints

- Time complexity: O(n)
- Space complexity: O(n)

## Sample Input

```
11
1 2 3 4 5 6 7 8 9 10 11
100
200
```

- Line 1: size of the list
- Line 2: elements of the list
- Line 3: value to be added using `addLast`
- Line 4: value to be added using `addFirst`

## Sample Output

```
1 2 3 4 5 6 7 8 9 10 11
200 11 10 9 8 7 6 5 4 3 2 1 100
```

- Line 1: the list before calling `reverseDR`
- Line 2: the list after calling `reverseDR`, followed by `addLast` and `addFirst` on the reversed list