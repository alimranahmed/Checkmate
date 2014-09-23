package checkmate.chess.com;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public abstract class Piece extends JLabel
{
	
	public String color = "white";
	public ImageIcon imageIcon;
	public String pieceType;
	
	public abstract String getColor();
	public abstract String getPieceType();
}
