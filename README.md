# COMP-170-Final-Project
Purpose and Goals
Create an easy to navigate adventure game that prompts the user with questions and changes the storypath depending on their input.
Key Functionalities
Receive integer, double, string and character values from the user.
Use the random library to make unique math problems every time the program is run
Use a timer to time the user when completing math problems
File I/O to print text to the user to advance the plot of the game
Print ASCII character pictures 
Keep score of points / lives throughout the game
Generate custom game experience based on prompts for the user
Input/Output
Input
Username
Difficulty
Initial “Start Game” input
An integer value that corresponds to an answer for a question posed to the user
Integer or double value that answers a math problem presented to the user
Answers to math problems most likely integers
Output
Large format text for the plot of the game
Different problems for different levels of difficulty that show up when the player runs into a monster
Different ASCII “monsters” that show up when the player runs into one
Functions
createMathProblem_Diff1
Difficulty 1 - easy, will only be addition/subtraction problems
createMathProblem_Diff2 
Difficulty 2 - med, will contain some low level multiplication/division problems
createMathProblem_Diff3
Difficulty 3 - hard, will contain multi digit multiplication and division problems
getDifficulty
Receives difficulty from the user
handlePathChoices
Asks user which path they would like to take and randomizes the chance of a “monster” appearance based on the selected path
getOperation
Gets random operation for problems based on users chosen difficulty
handleMonsterEncounter
Interprets the user's answer to the problem and outputs if it is correct or not. Handles amount of attempts and score as well. 
calculateAnswer
Method using parameters containing the numbers of the math problem that is outputted to the user. Using an if statement, it will go through each operator to check which was used, then calculate the output of the numbers based on the operator.
getUsername
Uses scanner to get a string for username, uses this name throughout the game to personalize the experience


pointTracker
Keeps track of player’s points, a new value added to integer totalpoints depending on how many attempts they make each turn
attemptCounter
Keeps track of how many attempts the player has made for any given turn, however many attempts the player makes, the fewer points they will receive. If they exceed 4 attempts, the game will automatically restart.
getEnding
At the very end of the game, this method tallies up all of the player’s points, and depending on how many they have, they get a specific ending.
Logic/Algorithms
Simple boolean logic
==
!=
etc.
While loops
If statements
For loops
Scoring system
Tracks and updates a players current score and 
Randomized math problems
Boolean variable in a while loop to make sure the game is actively being played
Error Handling
InputMismatchException
Thrown if user gives wrong input type
Testing Scenarios

