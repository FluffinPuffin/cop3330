Goal:
Our goal is to use a Linked List Class (JavaDocLinks to an external site.).   You must use the Linked List Object and not write your own.

Prompt
You are working in a store with two different lines to help people.   One of these lines is for people who just want to check out, the other is for people who want to return an item.   In most retail situations, the user will get into the checkout line and then told they need to join the customer service line once they get up front.   Your job is to simulate these two lines.   
The store will process 2 purchases for every 1 return.   This will be made clear in the example. 

Code Requirements
There will be two classes.   Store and Customer.
Customer Class
Includes name (String) and if they are buying (False) or returning (True)
Includes a constructor that takes in a String and a boolean. (See variables)
Includes two instance methods to return the name (getName()) and if they are returning (getBusiness())
Store Class
Includes two static LinkedLists that store Customers
Includes a main method
Ask the user what is the name of the file they would like to load.  Assume the file is in the project root directory. 
Main method reads information from the file.  Each customer will be in one line.
Load everyone in the file into the checkout line.   
Each cycle do the following: 
Take out two people out of the checkout line. 
If they are buying print "Name checkout"
If they are returning print "Name forwarded to return line"
If they are returning also put them in the return line.
Take out one person out of the return line.   Print out "Name returned an item"
