package checkmate.chess.com;

import javax.swing.ImageIcon;

//The boat
@SuppressWarnings("serial")
public class Rook extends Piece{
	//Default Constructor
		public Rook()
		{
			imageIcon = new ImageIcon("images/white_rook.png");
			setIcon(imageIcon);
		}
		
		//Constructor with Color Parameter
		public Rook(String color)
		{
			if(color == "white")
			{
				this.color = "white";
				imageIcon = new ImageIcon("images/white_rook.png");
				setIcon(imageIcon);
			}
			else
			{
				this.color = "black";
				imageIcon = new ImageIcon("images/black_rook.png");
				setIcon(imageIcon);
			}
		}
		
		public String getColor() 
		{
			return this.color;
		}

		@Override
		public String getPieceType() {
			return "rook";
		}
}
