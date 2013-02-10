I have two sand clocks, one that measures 4 minutes and one that measures 7.  How can I measure 9 minutes?

  Turn them both over at the same time.  When the 4 minute one runs out, the 7 minute one has 3 left.
  Turn both over again.  When the 7 minute one runs out, the 4 minute one has 1 left.  Ignore the 7 minute one from now.
  Turn the 4 minute one over.  The 9 minutes start here.
  Turn the 4 minute one over again.  You've measured 1 minute so far.
  Turn the 4 minute one over again.  You've measured 5 minutes so far.
  Turn the 4 minute one over again.  You've measured 9 minutes.

Write the functional factorial, both for the recursive version and the iterative version.

  See src/main/java/Factorial.java

Implement an algorithm that verifies if a binary tree is sorted.

  See src/main/java/BinaryTreeOrdered.java

I have a linked list and there may be a cycle.  How can I tell if there is a cycle?  What's the complexity?

  See src/main/java/LinkedListCycle.java - O(1) time, O(n) space

I have two large numbers that won't fit in any of Java's numeric types (i.e., ignore BigDecimal and BigInteger) so they
are stored in LinkedLists.  Write a function that will sum them both, returning a new LinkedList.

  See src/main/java/SumLinkedLists.java

Explain why the recursive implementation of quicksort will require O(log(n)) of additional space.

  Because it needs a new stack frame with a new pivot value etc.

Create an Iterator filtering framework: an IObjectTest interface with a single boolean
test(Object o) method. An Iterator sub-class which is initialized with another Iterator
and an IObjectTest instance. Your iterator will then allow iteration over the original,
but skipping any objects which don't pass the test. Create a simple unit test for this
framework.

  See src/main/java/iterators

Given

class Node {
    object value;
    Node next;
}
Implement method Node getFromEnd(node head, int i);

  See src/main/java/list/List#getFromEnd

Given Account and Transfer classes:
class Account {
  int amount;

  lock();
  unlock();
}

class Transfer {
  int amount;
  account a;
  account b;
}
Implement method void TransferMoney(Transfer t); trying to prevent a deadlock.

  See src/main/java/account/TransferMoney#transfer