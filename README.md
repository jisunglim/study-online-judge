# study-online-judge
#### This project is for archiving practical argorithm study through online judge. It is started from August 14th, 2016.

#### Created by
Jisung Lim ( iejisung@gmail.com )

## #1 Cycle of Specific Function
* let a, b be the integer greater than or equal to 0, and also less than or equal to 9.

* Specific function F is defined as following :   
    ```F( a * 10 + b ) = b + ( a + b ) % 10```


* Now we define the Cycle as the number of times that we need to execute the function for the original number to reappear again.

* In example, Let a = 2, b = 6.
    F(26) = 60 + 8 = 68
    F(68) = 80 + 4 = 84
    F(84) = 40 + 2 = 42
    F(42) = 20 + 6 = 26

Hence, the number of cycle for the number 26 is 4.

* files
    1. regCycle.java
    2. regCycleTest.java

