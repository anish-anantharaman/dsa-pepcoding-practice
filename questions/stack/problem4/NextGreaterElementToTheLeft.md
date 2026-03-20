1. You are given a number `n`, representing the size of array `a`.
2. You are given `n` numbers representing elements of array `a`.
3. You are required to print the next greater element on the left for all elements of the array.


The "Next greater element on the left" of an element `x` is defined as the first element to the left of `x` that has 
a value greater than `x`.
If no such element exists, print -1.

For example:

```
n = 9
a = [2 5 9 3 1 12 6 8 7]
```

Output:

```
-1 -1 -1 9 3 -1 12 12 8
```