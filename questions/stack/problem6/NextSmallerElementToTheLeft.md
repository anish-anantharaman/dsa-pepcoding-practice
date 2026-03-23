1. You are given a number `n`, representing the size of array `a`.
2. You are given `n` numbers representing elements of array `a`.
3. You are required to print the next smaller element to the left for all elements of the array.

"Next smaller element on the left" of an element `x` is defined as the first element on the left of `x` having a 
value smaller than `x`.

If no such element exists, consider -1 as its next smaller element.

For example:

```
n = 9
a = [2 5 9 3 1 12 6 8 7]
```

Output:

```
-1 2 5 2 -1 1 1 6 6
```