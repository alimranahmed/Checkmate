package checkmate.chess.com;

import javax.swing.ImageIcon;

//The elephant
@SuppressWarnings("serial")
public class Bishop extends Piece
{
	
	//Default Constructor
	public Bishop()
	{
		imageIcon = new ImageIcon("images/white_bishop.png");
		setIcon(imageIcon);
	}
	
	//Constructor with Color Parameter
	public Bishop(String color)
	{
		if(color == "white")
		{
			this.color = "white";
			imageIcon = new ImageIcon("images/white_bishop.png");
			setIcon(imageIcon);
		}
		else
		{
			this.color = "black";
			imageIcon = new ImageIcon("images/black_bishop.png");
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
		return "bishop";
	}
}
