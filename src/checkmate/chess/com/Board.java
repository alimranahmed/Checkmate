package checkmate.chess.com;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Board extends JPanel
{
	public Square[][] square = new Square[10][10];
	public Color black = new Color(150, 100, 50);
	public Color white = new Color(255, 255, 255);
	
	//Decleration of Black pieces
	public Pawn[] blackPawn = new Pawn[8];
	public Bishop[] blackBishop = new Bishop[2];
	public Knight[] blackKnight = new Knight[2];
	public Rook[] blackRook = new Rook[2];
	public King[] blackKing = new King[2];
	public Queen[] blackQueen = new Queen[2];
	
	//Decleration of White pieces
	public Pawn[] whitePawn = new Pawn[8];
	public Bishop[] whiteBishop = new Bishop[2];
	public Knight[] whiteKnight = new Knight[2];
	public Rook[] whiteRook = new Rook[2];
	public King[] whiteKing = new King[2];
	public Queen[] whiteQueen = new Queen[2];
	
	//Constructor
	public Board() 
	{
		initilizeVariables();
		setLayout(new GridLayout(8, 8));
		
		//Adding the squares in the Main Panel
		for (int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				square[i][j].setPosition(i, j);
				add(square[i][j]);
			}
		}
		//initializeChessBoard("white");
	}
	
	//Initialize the Data field
	public void initilizeVariables()
	{
		//Initialize and set the color of each square
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if((i + j) % 2 == 0 )
				{
					this.square[i][j] = new Square(i, j);
					this.square[i][j].setBackground(white); 
				}
				else
				{
					this.square[i][j] = new Square(i, j);
					this.square[i][j].setBackground(black);
				}	
			}
		}
		//Initialize Pawn
		for(int i = 0; i < 8; i++)
		{
			blackPawn[i] = new Pawn("black");
			whitePawn[i] = new Pawn("white");
		}
		
		//initialize the pieces;
		for(int i =0; i < 2; i++)
		{
			blackBishop[i] = new Bishop("black");
			whiteBishop[i] = new Bishop("white");
			
			blackKnight[i] = new Knight("black");
			whiteKnight[i] = new Knight("white");
			
			blackRook[i] = new Rook("black");
			whiteRook[i] = new Rook("white");
			
			blackQueen[i] = new Queen("black");
			whiteQueen[i] = new Queen("white");
			
			blackKing[i] = new King("black");
			whiteKing[i] = new King("white");
		}
	}
	
	//Setup the chess board with black as opponent to play(DEFAULT)
	public void initializeChessBoard()
	{
		//placing Pawn in the chess board
		for(int i = 0; i < 8; i++)
		{
			this.square[1][i].add(blackPawn[i]);
			this.square[6][i].add(whitePawn[i]);
			//set the pieces for the square
			this.square[1][i].setPiece(blackPawn[i]);
			this.square[6][i].setPiece(whitePawn[i]);
		}
		//Initialize other square as free
				for(int i = 0; i < 8; i++)
				{
					for(int j = 0; j < 8; j++)
					{
						this.square[i][j].setStatus(true);
					}
				}
		//placing Rook in the chess board
		this.square[0][0].add(blackRook[0]);
		this.square[0][7].add(blackRook[1]);
		this.square[7][0].add(whiteRook[0]);
		this.square[7][7].add(whiteRook[1]);
		//set The pieces of the square
		this.square[0][0].setPiece(blackRook[0]);
		this.square[0][7].setPiece(blackRook[1]);
		this.square[7][0].setPiece(whiteRook[0]);
		this.square[7][7].setPiece(whiteRook[1]);
		//placing Knight in the chess board
		this.square[0][1].add(blackKnight[0]);
		this.square[0][6].add(blackKnight[1]);
		this.square[7][1].add(whiteKnight[0]);
		this.square[7][6].add(whiteKnight[1]);
		//set the pieces
		this.square[0][1].setPiece(blackKnight[0]);
		this.square[0][6].setPiece(blackKnight[1]);
		this.square[7][1].setPiece(whiteKnight[0]);
		this.square[7][6].setPiece(whiteKnight[1]);
		//placing Bishop in the chess board
		this.square[0][2].add(blackBishop[0]);
		this.square[0][5].add(blackBishop[1]);
		this.square[7][2].add(whiteBishop[0]);
		this.square[7][5].add(whiteBishop[1]);
		//set the pieces
		this.square[0][2].setPiece(blackBishop[0]);
		this.square[0][5].setPiece(blackBishop[1]);
		this.square[7][2].setPiece(whiteBishop[0]);
		this.square[7][5].setPiece(whiteBishop[1]);
		//placing Queen & King in the chess board
		this.square[0][3].add(blackQueen[0]);
		this.square[0][4].add(blackKing[1]);
		this.square[7][3].add(whiteQueen[0]);
		this.square[7][4].add(whiteKing[1]);	
		//set the pieces
		this.square[0][3].setPiece(blackQueen[0]);
		this.square[0][4].setPiece(blackKing[1]);
		this.square[7][3].setPiece(whiteQueen[0]);
		this.square[7][4].setPiece(whiteKing[1]);	
		
		setAsNotFree();
		
	}
	
	//Setup the chess board to play(What pieces do you want?(white/black))
	public void initializeChessBoard(String yourPiece)
	{
		if(yourPiece.equalsIgnoreCase("white"))//when you want white
		{
			initializeChessBoard();
		}
		else if(yourPiece.equals("black"))//when you want black
		{
			//placing Pawn in the chess board
			for(int i = 0; i < 8; i++)
			{
				this.square[6][i].add(blackPawn[i]);
				this.square[1][i].add(whitePawn[i]);
				//set the pieces for the square
				this.square[6][i].setPiece(blackPawn[i]);
				this.square[1][i].setPiece(whitePawn[i]);
			}
			//placing Rook in the chess board
			this.square[7][0].add(blackRook[0]);
			this.square[7][7].add(blackRook[1]);
			this.square[0][0].add(whiteRook[0]);
			this.square[0][7].add(whiteRook[1]);
			//set pieces for the squares
			this.square[7][0].setPiece(blackRook[0]);
			this.square[7][7].setPiece(blackRook[1]);
			this.square[0][0].setPiece(whiteRook[0]);
			this.square[0][7].setPiece(whiteRook[1]);
			//placing Knight in the chess board
			this.square[7][1].add(blackKnight[0]);
			this.square[7][6].add(blackKnight[1]);
			this.square[0][1].add(whiteKnight[0]);
			this.square[0][6].add(whiteKnight[1]);
			//set pieces for the squares
			this.square[7][1].setPiece(blackKnight[0]);
			this.square[7][6].setPiece(blackKnight[1]);
			this.square[0][1].setPiece(whiteKnight[0]);
			this.square[0][6].setPiece(whiteKnight[1]);
			//placing Bishop in the chess board
			this.square[7][2].add(blackBishop[0]);
			this.square[7][5].add(blackBishop[1]);
			this.square[0][2].add(whiteBishop[0]);
			this.square[0][5].add(whiteBishop[1]);
			//set pieces for the squares
			this.square[7][2].setPiece(blackBishop[0]);
			this.square[7][5].setPiece(blackBishop[1]);
			this.square[0][2].setPiece(whiteBishop[0]);
			this.square[0][5].setPiece(whiteBishop[1]);
			//placing Queen & King in the chess board
			this.square[7][4].add(blackQueen[0]);
			this.square[7][3].add(blackKing[1]);
			this.square[0][4].add(whiteQueen[0]);
			this.square[0][3].add(whiteKing[1]);
			//set pieces for the squares
			this.square[7][4].setPiece(blackQueen[0]);
			this.square[7][3].setPiece(blackKing[1]);
			this.square[0][4].setPiece(whiteQueen[0]);
			this.square[0][3].setPiece(whiteKing[1]);
			
			setAsNotFree();
		}
		
	}
	
	//set the square containing pieces as not free
	public void setAsNotFree()
	{
		//set status for pawn
		for(int i = 0; i < 8; i++)
		{
			this.square[6][i].setStatus(false);
			this.square[1][i].setStatus(false);
			//set the pieces for the square
			this.square[6][i].setStatus(false);
			this.square[1][i].setStatus(false);
		}
		//set their status as not free
		this.square[0][0].setStatus(false);
		this.square[0][7].setStatus(false);
		this.square[7][0].setStatus(false);
		this.square[7][7].setStatus(false);
		this.square[0][1].setStatus(false);
		this.square[0][6].setStatus(false);
		this.square[7][1].setStatus(false);
		this.square[7][6].setStatus(false);
		this.square[0][2].setStatus(false);
		this.square[0][5].setStatus(false);
		this.square[7][2].setStatus(false);
		this.square[7][5].setStatus(false);
		this.square[0][3].setStatus(false);
		this.square[0][4].setStatus(false);
		this.square[7][3].setStatus(false);
		this.square[7][4].setStatus(false);
	}
	
	//set the color of the board
	public void setColor(Color black,Color white)
	{
		this.black = black;
		this.white = white;
		for(int i = 0; i < 8; i++)
		{
			for(int j = 0; j < 8; j++)
			{
				if((i + j) % 2 == 0 )
				{
					square[i][j].setBackground(white);
				}
				else
				{
					square[i][j].setBackground(black);
				}	
			}
		}
	}
}