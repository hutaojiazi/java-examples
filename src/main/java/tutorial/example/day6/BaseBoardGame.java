package tutorial.example.day6;

public abstract class BaseBoardGame
{
	// attributes
	private String board;

	// functions
	public String getBoard()
	{
		return board;
	}

	public void setBoard(final String board)
	{
		this.board = board;
	}

	public abstract void play();
}
