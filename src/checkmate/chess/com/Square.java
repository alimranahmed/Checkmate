package checkmate.chess.com;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Square extends JPanel
{
	private boolean status = true;	//status of the square(isFree or not)
	private Piece piece; //what piece is in the square;
	public boolean isActive = false;//whether the square is clicked to transfered its pieces 
	private int row;
	private int col;
	
	public Square(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
	//Check weather the square is free or not
	public boolean isFree()
	{
		return this.status;
	}
	
	//set the new status of the square
	public void setStatus(boolean status)
	{
		this.status = status;
	}
	
	//get the piece of the square
	public Piece getPiece()
	{
		return this.piece;
	}
	
	//set the new pieces to the square
	public void setPiece(Piece piece)
	{
		this.piece = piece;
	}
	//set the position of the row
	public void setPosition(int row, int col)
	{
		this.row = row;
		this.col = col;
	}
	
	public int getRow()
	{
		return this.row;
	}
	public int getCol()
	{
		return this.col;
	}
}
