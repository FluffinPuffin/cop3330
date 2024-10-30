You will write two classes, Bank and Account.  Please do this in two different files.   I am asking you not to be fancy. 
Within the Bank Class do the following:
Create a private static array of Account.   The size of the array will be 5.
Within the main method, create a menu that asks:
Displays the name of each account and the number.
Which account would you like to work on (Assign a value 1-5 to each account)
Exit Program
When they select the account, they can do the following:
If empty, it automatically creates an account.
To create an account, you need to ask the following information:
Account name
Interest rate (formatted as a double for example: 1.5)
If it is not empty ask the user if they would like to do the following:
Deposit Funds
Withdraw Funds
Check Balance
Calculate Interest
Delete Account
For each of these but delete will call a method in the Account class.  You will need to ask for the information here.
Delete account sets the index value to Null. 
Deposit, and Withdraw will return true if the operation is successful and a false if you are unable to complete it.  Do not check to see the user entered valid options here, allow the Account class to handle it. 
In the Account class do the following:
Create an instance private variable for the account name, balance, and interest rate
Create a constructor that will take in a String for the account name, and a double for the interest rate
Create the following public instance methods:
deposit - takes in a double that will represent the funds that should be deposited.  If the number is 0 or less, you cannot deposit this and return false, otherwise it will add this amount to the balance and return true.   
withdraw - takes in a double that will represent the funds that should be taken from the balance.  If the number is 0 or less or would make the balance less than 0 then you cannot withdraw this amount of funds and return false.  Otherwise, update the balance and return true.
getBalance - returns the balance as a double
getName - returns the name of the account
calcInterest - takes in an integer that will have value from 1-1,000 that represents how many months have passed.  Calculate interest that should be added to the account.  Example: If the balance is $100, interest is 10% and the parameter's value is 6 (months), then the new balance would be $105.00. 
