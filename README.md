# Language Assignment 2

Jeff Kahn
October 7 2020
La2



# Java Interpreter

In this assignment, we were tasked with commenting code given by our professor. This function interprets statements by creating a scanner and parser.
The Scanner contains Sets of collections for forming the tokens. These tokens consist of lexemes and ids that when combined with the grammar are evaluated by the environment to
perform operations and assignments and print the evaluation to stdout.

## Examples of functionality


## Input

("x = 2 -1;")
("x = -2 + 1;")
("x =# Hello# -2 +1;")
("x = 1.0 + 2.0;")
("x = 1.0;" "y = x+ 2.2;")
## Output
1.0
-1.0
-1.0
3
1
3.2