1. You are given a number `n`, representing the number of people at a party.
2. You are given a matrix of sie `n x n` containing only 0 and 1.
3. If there is a 1 at position (i, j), it means person `i` knows person `j`.
4. A celebrity is defined as someone who:
    a) Knows no one else (row should be all 0s), and
    b) Is known by everyone else ((column should be all 1s except diagonal).
5. You need to print:
   a) The index of the celebrity, if one exists
   b) Otherwise, print "none"