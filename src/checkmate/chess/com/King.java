package checkmate.chess.com;

import javax.swing.ImageIcon;

//The supper power Rani
@SuppressWarnings("serial")
public class King extends Piece{
	//Default Constructor
		public King()
		{
			imageIcon = new ImageIcon("images/white_king.png");
			setIcon(imageIcon);
		}
		
		//Constructor with Color Parameter
		public King(String color)
		{
			if(color == "white")
			{
				this.color = "white";
				imageIcon = new ImageIcon("images/white_king.png");
				setIcon(imageIcon);
			}
			else
			{
				this.color = "black";
				imageIcon = new ImageIcon("images/black_king.png");
				setIcon(imageIcon);
			}
		}
		
		public String getColor() 
		{
			return this.color;
		}

		@Override
		public String getPieceType() {
			return "king";
		}
}
