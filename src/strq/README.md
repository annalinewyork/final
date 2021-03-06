# String Queue

In this problem, you will implement a "string queue". This data structure
behaves as a queue of individual characters, except that enqueueing and 
dequeueing are done with strings (which are effectively sequences of characters)
rather than individual characters.

For example, 

- start with an empty queue

- enqueue "BOLDLY TO GO" 

- dequeue 7 characters, which returns "BOLDLY " and leaves "TO GO" in the queue

- enqueue " TO THE STORE", which leaves "TO GO TO THE STORE" in the
  queue

- dequeue 6 characters, which returns "TO GO " and leaves "TO THE
  STORE" in the queue

We've provided for you an _interface_ [`StringQueue`](StringQueue.java). Your
task is to create a new class `SimpleStringQueue` in a new Java source file that
_implements_ this interface. Do not modify the interface.

Your implementation can use a single string attribute for the contents of the queue.

We've also provided a simple [test class](Test.java). 

