package Quiz.Quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class dbManager {
	Connection con;

	public dbManager() throws SQLException {
		String jdbcUrl = "jdbc:sqlite:src/main/resources/db/db.sqlite";
		con = DriverManager.getConnection(jdbcUrl);
	}

	public Frage getFrage(int FragenId) throws Exception {
		PreparedStatement stm = con.prepareStatement("Select * from Fragen where id = ?;");
		stm.setString(1, FragenId +"");
		System.out.println(stm);
		ResultSet set = stm.executeQuery();
		if(!set.next()) {
			throw new Exception("frage nicht gefunden"); 
		};
		int id = set.getInt("id");
		String frage = set.getString("frage");
		String[] fragenArray = { 
				set.getString("antwort1"), 
				set.getString("antwort2"), 
				set.getString("antwort3"),
				set.getString("antwort4") };
		String richtigeAntwort = set.getString("richtigeAntwort");
		String kategorie = set.getString("kategorie");
		Frage aufgabe = new Frage(id, frage, richtigeAntwort, fragenArray, kategorie);
		stm.close();
		set.close();
		return aufgabe;
	}
	public int maxId() throws SQLException {
		PreparedStatement stm = con.prepareStatement("Select count(*) as c from Fragen;");
		ResultSet set = stm.executeQuery();
		set.next();
		System.out.println(set.getString("c"));
		int max = set.getInt("c");
		set.close();
		stm.close();
		return max;
		
	}
	public void close() {
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Spieler getSpieler(int id) throws SQLException {
		PreparedStatement stm = con.prepareStatement("Select * from Spieler where id = ?;");
		stm.setString(1, id +"");
		ResultSet set = stm.executeQuery();
		set.next();
		
		return new Spieler(set.getInt("id"),set.getString("name"), set.getInt("highscore"));
	}
	
}
