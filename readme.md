# Checkmate
A chess game using Java(J2EE) and JAVA Swing API. 

## Features
1. Programmed based Object Oriented Programming fully
2. Methods and classes are very much dynamic
3. GUI is created using Java Swing API.
4. Any future code cab be embaded easily.
5. Core java is used
6. Well commented

## Limitions
1. Human vs. Human only
2. Change of settings at runtime is not enabled.

## Internal Architecture
There are 10 seperate classes to organize the program properly. RunChess class contains the main method, the starting point of the program. This class also contains the conditions of turn of pieces. Other 9 classes are explained below:

1. **Square**: This public class extends the Jpanel class of Swing API. This class has four attributes described below:
	1.1. status: Contain whethere the square is free or not.
	1.2. piece: If the square is not free then contain the piece of the square.
	1.3. isActive: Contain whether the square was clicked.
	1.4. row: The row position of the square.
	1.5. col: The column position of the square.
Each of the above attribute has their needed getter or setter method.

2. **Board**: This is the public class that extends JPanel class of Swing API and contains all the squares and pieces of needed in chess game. This class has all necessary method to initialize methods the board as per user's preferences. This board is very much dynamic. It can initialize with according any of user's prefernce. Even the color of the squares of the board can be changed by just calling the setColor(Color black,Color white) if user wants.

3. **Piece**: Piece class is an abstract class. This class contains three attributes a) color, b) imageIcon and c) pieceType. This class also contains tow abstract methos defined as getColor() and getPieceType(). getColor() methos returns the color (black/white) of the piece on the other hand getPieceType() method return the type(e.g. pawn) of the piece.

4. **Pawn**: This class extends abstract class Piece. This class has no attribute but two constructors. The defult constructor construct a pawn of white color. On the other hand the other constructor that receive the color of the piece construct the pawn with defined color. This class implement the abstract methods of its parent class Piece.

5. **Knight**: Same methods and constructors as pawn but this class construct Knight.

6. **Rook**: Same methods and constructors as pawn but this class construct Rook.

7. **Bishop**: Same methods and constructors as pawn but this class construct Bishop.

8. **Queen**: Same methods and constructors as pawn but this class construct knight.

9. **King**: Same methods and constructors as pawn but this class construct King.



