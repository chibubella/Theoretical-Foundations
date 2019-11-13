# Theoretical-Foundations

Authors: Ariel Badie, Bella Obidike, Kyndal Harp, Marquise Jennett, Tracy Bridges

This program has been designed to read a text file containing the description of a DFA and determine which input string scan be accepted or rejected the DFA.
The text file has to follow this format:
Line 1 : {alphabet set}
Line 2: {state set}
Line 3: start state}
Line 4: {accept state set}
Line 5 and onwards: Transtion functions e.g. (a,0)->b

For this project we have three classes for our project on reading a text file DFA and accepting and/or rejecting the strings inputed by the user.
The first class is called State which hold the methods used to define states as final states and accept states.
The second class is called Transition which hold the methods for transition states. 
The third class is our DFA class, where we read the file given by the user. We have designed our program so that there is a buffer reader to read one line at a time so that we can handle and sort the different information easily.
The first line read holds the set of alphabets used in the DFA and as it is read it is added to the alphabet hash set. 
The next line read has the set of states used in the DFA and these are added to the states hash set.
The third line read is the start state, which lets the program know where to start once the user inputs a string.
The fourth line is the set of accept states. If any of the strings inputted by the user end in an accept state, the string will be accepted, if not it is rejected.
At the point in our program where the accept states are being read from the file they are being turned into final states as well. 
The fifth line and every line after are the transition functions, how one state moves to another states when it reads a certain input from the string inputted by the user.
These transitions are read and put into a Hash Set. 
Once all the transitions have been read the user is prompted to input a string. This string inputed by the user is read and goes down to our next while loop where it is either rejected or accepted.
If the user inputs a string that contains a character not in the defined alphabet set then it will be rejected. If the string does contain the correct alphabet it goes to the next if statement which calls on our method calculateFinalState.
The CalculateFinalState method requires a state, which is initially the start state, and a list/queue in order to run. The string inputted by the user is then broken down into a LinkedList. 
This LinkedList is then inputted into the CalculateFinalState method. This method reads a state and an integer and goes through the transition Hash Set to find which transition function starts with that exact state and input integer. 
This requires the GetNextState method which goes through the transition Hash Set to find the next states from a given state and input.
When the list is finally empty, if the current state is an except state, the method return true if not ir returns false. If true is returned, the "Accepted" is printed out by the console. If false is returned, "Rejected" is printed out on the console.
After a string has been rejected of accepted the user will be prompted to either input another string where this process will repeat for the new string or the user can type in the word exit which will end the program. 

