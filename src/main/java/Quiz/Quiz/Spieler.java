package Quiz.Quiz;

public class Spieler {

	private int id;
	private String name;
	private int highscore;
	
	
	
	public Spieler(int id, String name, int highscore) {
		super();
		this.id = id;
		this.name = name;
		this.highscore = highscore;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id + " " + name +" " + highscore;
	}
	public int getId() {
		return id;
	}
	
	
	
}
