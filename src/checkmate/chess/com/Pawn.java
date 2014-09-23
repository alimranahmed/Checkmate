package checkmate.chess.com;

import javax.swing.ImageIcon;
	
//The soldiers
@SuppressWarnings("serial")
public class Pawn extends Piece
{
	
	//Default Constructor
		public Pawn()
		{
			imageIcon = new ImageIcon("images/white_pawn.png");
			setIcon(imageIcon);
		}
		
		//Constructor with Color Parameter
		public Pawn(String color)
		{
			if(color == "white")
			{
				this.color = "white";
				imageIcon = new ImageIcon("images/white_pawn.png");
				setIcon(imageIcon);
			}
			else
			{
				this.color = "black";
				imageIcon = new ImageIcon("images/black_pawn.png");
				setIcon(imageIcon);
			}
		}
		
		public String getColor() 
		{
			return this.color;
		}

		@Override
		public String getPieceType() 
		{
			return "pawn";
		}
}
