package checkmate.chess.com;

import javax.swing.ImageIcon;

//The minister
@SuppressWarnings("serial")
public class Queen extends Piece{
	//Default Constructor
		public Queen()
		{
			imageIcon = new ImageIcon("images/white_queen.png");
			setIcon(imageIcon);
		}
		
		//Constructor with Color Parameter
		public Queen(String color)
		{
			if(color == "white")
			{
				this.color = "white";
				imageIcon = new ImageIcon("images/white_queen.png");
				setIcon(imageIcon);
			}
			else
			{
				this.color = "black";
				imageIcon = new ImageIcon("images/black_queen.png");
				setIcon(imageIcon);
			}
		}
		
		public String getColor() 
		{
			return this.color;
		}

		@Override
		public String getPieceType() {
			return "queen";
		}
}
