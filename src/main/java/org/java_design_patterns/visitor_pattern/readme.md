# Intent

Represent an operation to be performed on the elements of an object structure. Visitor lets you
define a new operation without changing the classes of the elements on which it operates.

## Explanation

Consider a tree structure with army units. Commander has two sergeants under it and each sergeant
has three soldiers under them. Given that the hierarchy implements the visitor pattern, we can
easily create new objects that interact with the commander, sergeants, soldiers, or all of them.