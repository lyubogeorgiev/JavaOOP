Lab 01 - Number in Range
-

Using try-catch block to control the program flow. If the number can't be parsed to int or the number is out of range, 
a new NumberFormatException is thrown and the appropriate message is displayed on the console. When number is successfully 
parsed to an int and also in the range, the program ends and a message with the valid number is displayed. 

Lab 02 - Square Root
-

Used try-catch-finally block. Truing to parse a number from the console. If the input is not a NumberFormatException is 
thrown with the message and the finally block is executed. If the number is negative, as according to the requirements 
doesnt exist a square root of a negative number, then we throw a NumberFormatException and finally the finally block is 
also executed. In case the input is correct and there is no exception thrown, we print the desired output and also finally 
block is executed. 

Lab 03 - Enter Numbers
-

try block with 2 catch clauses was implemented in order to be able to throw different exceptions in different cases with 
different messages. 

Lab 04 - Fixing
-

Intentionally the code is written trying to access an element out of array's bounds. The fix is to use a try-catch 
block to handle the exception without stopping the program execution and just throwing the appropriate exception message. 