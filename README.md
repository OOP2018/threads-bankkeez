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
| Unsynchronized counter  | 10,000,000         | 0.016909        |
| Using ReentrantLock     | 10,000,000         | 0.836442        |
| Synchronized method     | 10,000,000         | 0.865581        |
| AtomicLong for total    | 10,000,000         | 0.341869        |

## 1. Using unsynchronized counter object

1.1 Sometime it becomes 0. When running multiple threads at the same time, it goes into the condition called race condition.

1.2 Average runtime is 0.016909.

1.3 Due to race condition, sometimes the AddTask or SubtractTask still using the old value.

## 2. Implications for Multi-threaded Applications

How might this affect real applications?  

2. He will confront the problem not having the same amount of money in his 
account that is open on different devices. Or he could cheat the bank by multiple withdrawn from different places.

## 3. Counter with ReentrantLock

3.1 The total is always zero. Average runtime is 0.836442.

3.2 Using the CounterWithLock class that uses the ReentrantLock.

3.3 ReentrantLock provides synchronization to method while sharing same resources. It gives a lock to the current working thread and blocks all other threads which are trying to take a lock on the shared resource.

3.4 When done the try process, it must finally do the finally body.

## 4. Counter with synchronized method

4.1 The total is always zero. Average runtime is 0.865581.

4.2 It avoid the overhead call by calling superclass add instead.

4.3 Synchronized means happening at the same time. I will use it when my program is using the same resource from multiple thread at the same time.

## 5. Counter with AtomicLong

5.1 AtomicLong is thread-safe.

5.2 Atomic operation work similarly to ReentrantLock. It locks (kind of) the value for the first thread calling it to finish the work then other thread could call for it. Means that work must be done at that time without an interruption.

## 6. Analysis of Results

6.1 Synchronized method seems to be the slowest while AtomicLong for total is the fastest.

6.2 In my opinion using Lock is the best way because you can lock thread at a time, it can also be develop into more complex lock in future.

## 7. Using Many Threads (optional)



