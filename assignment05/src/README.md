Messages will be between 5 and 1,000,000 units long.
Messages will have groups to show which parts need to be encoded first.
The character '1' will show a start of a group, and the character '2' will the end
Each grouping will 3 characters.  Take the middle value will always be a vowel and the two end values will be consonants.   
Instead of consonants, another grouping can replace one or both of them.   A grouping cannot replace a vowel.   
You must evaluate the nested/replaced groupings.  Since 1 and 2 give you the end you can read it left to right. 
The output should only have the letters inside. 

Class Name:  WordScramble
Public Static Methods:
String encode(String)
Must use the Stack Class
Strings will be no less than 5
Strings will have the same amount of 1s and 2s.
A 1 must come before a matching 2.

Vowels enter a stack, when we find "2" take 2 vowels off the stack
