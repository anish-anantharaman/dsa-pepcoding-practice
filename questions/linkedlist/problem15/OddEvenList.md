# Segregate Odd And Even Elements In A Linked List

## Problem

You are given a partially written `LinkedList` class. Complete the body of the `oddEven` function. The function is expected to rearrange the list so that all **odd** values are followed by all **even** values. The relative order of the elements must not change.

Also take care of the cases when there are no odd or no even elements. Make sure to properly set `head`, `tail` and `size`, as the function will be tested by calling `addFirst` and `addLast`.

> **Note:** Input and output are managed for you. The function must rearrange the list in linear time and constant space.

## Constraints

- Time complexity: O(n)
- Space complexity: O(1)

## Sample Input

```
7
2 8 9 1 5 4 3
10
100
```

- Line 1: size of the list
- Line 2: elements of the list
- Line 3: value to be added using `addFirst`
- Line 4: value to be added using `addLast`

## Sample Output

```
2 8 9 1 5 4 3
9 1 5 3 2 8 4
10 9 1 5 3 2 8 4 100
```

- Line 1: the list before calling `oddEven`
- Line 2: the list after calling `oddEven`
- Line 3: the list after calling `addFirst` and `addLast` on the rearranged list