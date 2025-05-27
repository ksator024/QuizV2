package Quiz.Quiz;

import java.util.ArrayList;

public class FragenManager {

	dbManager db;
	ArrayList<Integer> sessionIds = new ArrayList<Integer>();
	
	
	Frage neueFrage() throws Exception {
		int id = 0;
		while(sessionIds.contains(id)){
			id = (int) Math.random()*db.maxId() +1;
		}
		Frage neueFrage = db.getFrage(0);
		return neueFrage;
		
		
	}
	
	
	
	
	
	
	
	
	
}
