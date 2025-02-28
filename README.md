# MathQuest  

**MathQuest** is a **text-based adventure game** written in **Java** in which you find yourself lost in the woods, unable to remember how to get home. Traverse down paths and solve math problems to defeat monsters you may run into along the way! Depending on your skill, who knows how things will turn out in the end?? 

## Features  
- **ASCII art** – Randomized ASCII art to enhance the look and feel of the game
- **Learning aspect** – Interactive learning experience, great for young students
- **Interactive Storytelling** – Choices influence the game’s progression.  
- **Varied life/point system** - Number of lives and points earned depends on difficulty chosen

## Technologies and strategies Used  
- **Java** – Core programming language
- **Object-Oriented Design** – Modular and scalable structure
- **File IO** - utilizes File IO to show ASCII art  
## How to Use
1. Run the Program
2. Follow the prompts on the screen and input answers into the console
3. Try to get the highest score
4. Have Fun!

## Project Structure
Monsters directory
- Holds all of the ASCII `.txt` files

Main Class
- Acts as a driver for the game

PreGameInfo Class
- Handles initialization, including capturing the players username, determining the difficulty level, and controlling the game start.
  
Path Class
- Manages the navigation system, allowing users to choose paths introducing encounters

EnemyEncounter Class
- Implements the core mechanics of the game, such as math problem solving, tracking points, and managing lives.

MathProblem Class
- Generates randomized math problems based on difficulty levels

MonsterPrinter Class
- Responsible for displaying ASCII art for monsters

Ending Class
- Determines and displays the games ending based on the players performance

## Installation  
First, clone the repository using Git:

```sh
git clone https://github.com/JacksonHoran/MathQuest.git
```
Then, `cd` to the repository 

```sh
cd /path/to/directory
```

Then, Compile the `.java` file

```sh
javac Main.java
```
Finally, run the program

```sh
java Main
```

Feel free to reach out with any issue, comments, or concerns!
