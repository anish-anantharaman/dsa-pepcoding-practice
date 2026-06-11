# Custom Queue Implementation Problem
<br/>
You are required to create a Custom Queue, which should mimic the behaviour of java.util.Queue class and implement FIFO semantic.
Here is the list of functions supposed to implement.
<br/>

a) add → should accept new data if there is space available in the underlying array or print "Queue overflow" otherwise.
<br/>
b) remove → should remove and return front data if available or print "Queue underflow" otherwise.
<br/>
c) peek → should return the front data if available or print "Queue underflow" otherwise and return -1.
<br/>
d) size → should return the number of elements available in the queue.
<br/>
e) display → should print the elements of queue in FIFO manner (space-separated) ending with a line break.

```
Note: Data will be only Integers.
```

```
Sample Input
5
add 10
display
add 20
display
remove
```

```
Sample Output
10
10 20
10
```