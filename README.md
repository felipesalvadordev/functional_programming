# Functional Programming in Java with Examples  
Basically, functional programming is a style of writing computer programs (programming paradigm) that treat computations as evaluating mathematical functions.  
The basic objective of this style of programming is to make code more concise, less complex, more predictable, and easier to test compared to the legacy style of coding. 
Functional programming deals with certain key concepts such as pure function, immutable state, assignment-less programming etc.  
It emphasizes the use of pure functions that don't have side effects and always return the same output for a given input.

## Consumer
It represents a function which takes in one argument and produces a result. However these kind of functions don’t return any value.

## BiConsumer
It represents a function that takes in two arguments and produces a result. However, these kinds of functions doesn’t return any value.

## Function
Interface that takes two inputs 'T' and 'U' and produces an output of type 'R'.

## Function Composition
is a technique to combine multiple functions into a single function which uses the combined functions internally.

## BiFunction
It represents a function which takes in two arguments and produces a result and return it.

## BiPredicate
It operates on two objects and returns a predicate value based on that condition.

## Currying
Function Currying is a concept of breaking a function with many arguments into many functions with single argument in such a way, that the output is same. 
In other words, its a technique of simplifying a multi-valued argument function into single-valued argument multi-functions.

## Predicate
Represents a boolean-valued function that takes one argument and returns a boolean result

## Supplier
Interface is to defer the execution of some code.

## Runnable
Used to create a thread, starting the thread causes the object run method to be called in a separately executing thread.  
The general. contract of this run() method is that it may take any action whatsoever. It cannot return the result of computation.

## Callable
Used to encapsulate tasks supposed to be executed by another thread. It can return the result of the parallel processing of a task.

# References
https://www.baeldung.com/java-functional-programming  
https://www.geeksforgeeks.org/functional-programming-in-java-with-examples/



