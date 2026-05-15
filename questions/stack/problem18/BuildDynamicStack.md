1. You are required to create a Dynamic Custom Stack, which should mimic the behaviour of java.util.Stack class and implement LIFO (Last In First Out) semantics.
   Unlike a fixed-size stack, this stack should automatically grow when it becomes full.

2. Here is the list of functions supposed to implement:

    <br/>
    
    a) push → Should accept new data and insert it at the top of the stack.
       If the underlying array becomes full, create a new array of size double the current capacity, copy all existing 
       elements into it, and then insert the new element.
    <br/>
    
    b) pop → Should remove and return the last inserted data if available.
       If the stack is empty, print "Stack underflow".
    <br/>
    
    c) top → Should return the last inserted data if available.
       If the stack is empty, print "Stack underflow" and return -1.
    <br/>
    
    d) size → Should return the number of elements currently present in the stack.
    <br/>
    
    e) display → Should print the elements of the stack in LIFO order (top to bottom), space-separated, ending with 
       a line break.

Note:
```
    Data will only be Integers.
```


Sample Input:
```
    5
    push 10
    push 20
    push 30
    push 40
    push 50
    push 60
    display
    size
```

Sample Output:
``` 
    60 50 40 30 20 10
    6
```