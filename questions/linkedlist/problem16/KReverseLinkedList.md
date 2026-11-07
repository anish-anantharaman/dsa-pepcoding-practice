# K Reverse In A Linked List

## Problem

You are given a partially written `LinkedList` class. Complete the body of the `kReverse` function. The function is expected to rearrange the list so that all groups of `k` elements in the list get reversed and linked. If the last set has fewer than `k` elements, leave it as it is (don't reverse it).

> **Note:** Input and output are managed for you. The function must reverse the groups in linear time and constant space.

## Constraints

- Time complexity: O(n)
- Space complexity: O(1)

## Sample Input

```
11
1 2 3 4 5 6 7 8 9 10 11
3
100
200
```

- Line 1: size of the list
- Line 2: elements of the list
- Line 3: value of `k` (group size)
- Line 4: value to be added using `addFirst`
- Line 5: value to be added using `addLast`

## Sample Output

```
1 2 3 4 5 6 7 8 9 10 11
3 2 1 6 5 4 9 8 7 10 11
100 3 2 1 6 5 4 9 8 7 10 11 200
```

- Line 1: the list before calling `kReverse`
- Line 2: the list after calling `kReverse`
- Line 3: the list after calling `addFirst` and `addLast` on the rearranged list