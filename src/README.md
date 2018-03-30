## Threads and Synchronization

This lab illustrates the problem of synchronization when many threads are operating on a shared object.  The general issue is called "thread safety", and it is a major cause of errors in computer software.

## Assignment

To the problems on the lab sheet and record your answers here.

1. Record average run times.
2. Write your explanation of the results.  Use good English and proper grammar.  Also use good Markdown formatting.

## ThreadCount run times

These are the average runtime using 3 or more runs of the application.
The Counter class is the object being shared by the threads.
The threads use the counter to add and subtract values.

| Counter class           | Limit              | Runtime (sec)   |
|:------------------------|:-------------------|-----------------|
| Unsynchronized counter  |0.016909            |                 |
| Using ReentrantLock     |0.836442            |                 |
| Syncronized method      |                    |                 |
| AtomicLong for total    |                    |                 |

## 1. Using unsynchronized counter object

answer the questions (1.1 - 1.3)

1.1 Sometime it becomes 0. When running multiple threads at the same time, it goes into the condition called race condition.

1.2 average runtime is 0.016909

1.3 due to race condition, sometimes the AddTask or SubtractTask still using the old value.

## 2. Implications for Multi-threaded Applications

How might this affect real applications?  

He will confront the problem not having the same amount of money in his 
account that is open on different devices.

## 3. Counter with ReentrantLock

answer questions 3.1 - 3.4

3.1 The total is always zero. Average runtime is 0.836442

3.2 Using the CounterWithLock class that uses the ReentrantLock

3.3 ReeantrantLock provides synchronization to method while sharing same resources. It gives a lock to the current working thread and blocks all other threads which are trying to take a lock on the shared resource.

3.4 When done the try process, it must finally do the finally body.

## 4. Counter with synchronized method

answer question 4

## 5. Counter with AtomicLong

answer question 5

## 6. Analysis of Results

answer question 6

## 7. Using Many Threads (optional)

