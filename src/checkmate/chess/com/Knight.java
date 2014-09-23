package checkmate.chess.com;

import javax.swing.ImageIcon;

//The horse
@SuppressWarnings("serial")
public class Knight extends Piece{
	//Default Constructor
		public Knight()
		{
			imageIcon = new ImageIcon("images/white_knight.png");
			setIcon(imageIcon);
		}
		
		//Constructor with Color Parameter
		public Knight(String color)
		{
			if(color == "white")
			{
				this.color = "white";
				imageIcon = new ImageIcon("images/white_knight.png");
				setIcon(imageIcon);
			}
			else
			{
				this.color = "black";
				imageIcon = new ImageIcon("images/black_knight.png");
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
			return "knight";
		}
}
