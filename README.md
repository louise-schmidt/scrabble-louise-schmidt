# Scrabble

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

Interactive graphic programming language heavily inspired by 
[Scratch](https://scratch.mit.edu).
This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/), 
and aims purely to be used with the purpose of teaching in the context of the course 
_CC3002 Metodologías de Diseño y programación_ of the 
[_Computer Sciences Department (DCC)_](https://www.dcc.uchile.cl) of the 
_University of Chile_.

---

## Project Description
The following project represents a simplified version of *Scratch*, a programming enviroment where the user can create simple programs without having a further knowledge in programming languages. 

It includes three basic types and three subtypes:
1. Strings
2. Booleans
3. Numbers
    1. Integers
    2. Floats
    3. Binarys

It also includes transformations and basic operations between types. The transformations are:
- to String
- to Bool
- to Float
- to Int
- to Binary

and the operations are:
- addition
- subtraction
- multiplication
- division
- negation
- logical conjunction
- logical disjunction


The program includes its self representation through an **Abstract Syntaxis Tree (AST)** where each node is an instruction (transformations and operations). It also optimizes the variables and memory via considering each variable as a pair `(id, value)` where *id* is the name of the variable with its *value*. The program is planned as a [MVC software design pattern](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller).


## Project Setup
- Have a compatible version of the JVM on your system (Java 14 works)
- Clone the repo with the following command:
```
git clone https://github.com/CC3002-Metodologias/scrabble-louise-schmidt
```
- Run the "Scrabble.java" file (uncomplete)
