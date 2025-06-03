package Quiz.Quiz;

import java.util.ArrayList;

public class FragenManager {

	dbManager db;
	ArrayList<Integer> sessionIds = new ArrayList<Integer>();
	
	
	Frage neueFrage() throws Exception {
		int id;;
		//while(sessionIds.contains(id)){
	//		id = (int) Math.random()*db.maxId() +1;
		//}
		id = (int) (Math.random()*db.maxId() +1);
		System.out.println("id"+id);
		System.out.println(db.maxId());
		Frage neueFrage = db.getFrage(id);
		return neueFrage;
	}


	public FragenManager(dbManager db) {
		super();
		this.db = db;
	}
	
	
	
	
	
	
	
	
	
}
