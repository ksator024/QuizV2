package Quiz.Quiz;

public class Frage {
String fragestellung;
int id;
String richtigeAntwort;
String[] antwortenArray = new String[4];
String kategorie;
public Frage(int id,String frage, String richtigeAntwort, String[] antwortenArray, String kategorie) {
	super();
	this.id = id;
	this.fragestellung = frage;
	this.richtigeAntwort = richtigeAntwort;
	this.antwortenArray = antwortenArray;
	this.kategorie = kategorie;
}
public String getFrage() {
	return fragestellung;
}
public int getId() {
	return id;
}
public String getRichtigeAntwort() {
	return richtigeAntwort;
}
public String[] getAntwortenArray() {
	return antwortenArray;
}
public String getKategorie() {
	return kategorie;
}
				
	
}
