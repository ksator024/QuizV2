package Quiz.Quiz;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Layout extends BorderPane
{
	App app;
	VBox vbox = new VBox(); // in der Vbox sind Antwortmöglichkeiten a - c drinnen
	VBox vbox2 = new VBox(); //dort nur die Frage damit es schöner gelayoutet werden kann
	HBox hbox = new HBox(); 	// beinhaltet Fragen a und b
	HBox hbox2 = new HBox();	// beinhaltet Fragen c und d 
	HBox hbox3 = new HBox();
	HBox hbox4 = new HBox();
	HBox buttonBox = new HBox();
		
	RadioButton RadioA = new RadioButton(); //
	RadioButton RadioB = new RadioButton();
	RadioButton RadioC = new RadioButton();
	RadioButton RadioD = new RadioButton();

	Pane scoreP = new Pane();
	
	ToggleGroup tg = new ToggleGroup(); // macht das nur ein RadioButton gleichzeitig an sein kann

	
	private String fragestellung;		// alle Objekte
	private String antwort;		// die in dieser
	private String a;			// Klasse benögtigt
	private String b;			// werden
	private String c;
	private String d;
	private int fragenNummer;
	final int spacing = 250;
	final int fontSize = 30;
	/**
	 * @param Frage
	 * @param Antwort
	 * @param a
	 * @param b
	 * @param c
	 * @param d
	 */
	public Layout(App app)
	{
		this.app = app;
	}
	
	public void createLayout() 
	{
		
		
		
		// wenn irgenjemand auf die Idee kommen sollte
		// eine Zahl in einem Parameter zu ändern 
		// wird er von mir höchstpersönlich in die Hölle geschickt!!!!! 
		
		Font fon = new Font(fontSize);
		
		// erstellung der Labels die dem User als Antwortmöglichkeiten/Frage angezeigt wird
		
		Label labelFrage = new Label(this.fragestellung);
		labelFrage.setFont(fon);
		
		Button weiterKnopf = new Button();
		weiterKnopf.setText("WEITER");
		weiterKnopf.setFont(fon);
		weiterKnopf.setMinWidth(180);
		weiterKnopf.setMinHeight(90);
		weiterKnopf.setId("weiterbutton");  // keine Ahnung was da eigentlich abgeht 😢
		weiterKnopf.setOnAction(app);
		buttonBox.getChildren().add(weiterKnopf);
		
		
		
		
		int score = 10;
		
		Button scoreB = new Button();
		scoreB.setText("Score:" + score);
		scoreB.setMinWidth(180);
		scoreB.setMinHeight(90);
		scoreB.setDisable(true);
		scoreP.getChildren().add(scoreB);
		scoreB.setLayoutX(600);
		this.setLeft(scoreP);
		
		
		
		
		
		
		// deklarierung aller Eigenschafften des Radiobuttons
		RadioA.setOnAction(app); // Action event. Ist in der App als Handle Methode 
		RadioA.setText(a);		 //	Text setzten
		RadioA.setFont(fon);	 // Font wurde oben Deklariert
		RadioA.setWrapText(true);	// ZEILENUMBRUCH 
		RadioA.setPrefWidth(230);	// falls Christoph das hier liest schuldet er mir eine Fleischkaßsemmel
		RadioA.setPrefHeight(150);	// Nichts ändern 
	
		RadioB.setOnAction(app);
		RadioB.setText(b);
		RadioB.setFont(fon);
		RadioB.setWrapText(true);
		RadioB.setPrefWidth(230);
		RadioB.setPrefHeight(150);

		
		RadioC.setOnAction(app);
		RadioC.setText(c);
		RadioC.setFont(fon);
		RadioC.setWrapText(true);
		RadioC.setPrefWidth(230);
		RadioC.setPrefHeight(150);
		
		
		RadioD.setOnAction(app);
		RadioD.setText(d);
		RadioD.setFont(fon);
		RadioD.setWrapText(true);
		RadioD.setPrefWidth(230);
		RadioD.setPrefHeight(150);
		
		tg.getToggles().clear(); // muss vorher gelöscht werden das die Radiobuttons Global sind
		tg.getToggles().addAll(RadioA,RadioB,RadioC,RadioD);
		
		// Aussehen
		// 		  Frage
		//		A		B
		//		C		D
		
		vbox2.getChildren().add(labelFrage);
		labelFrage.setMaxWidth(300);
		labelFrage.setWrapText(true);
		vbox2.setTranslateX(240);	// die Zahlen können nicht geändert werden. Siehe oben 
		vbox2.setTranslateY(20);
		
		vbox.getChildren().addAll(hbox, hbox2);
		vbox.setTranslateX(170);
		vbox.setTranslateY(20);

		hbox3.setTranslateX(-120);
		hbox3.setTranslateY(30);


		hbox4.setTranslateX(50);
		hbox4.setTranslateY(-150);

		


		hbox3.getChildren().addAll(RadioA, RadioB);

		hbox4.getChildren().addAll(RadioC, RadioD);

		
		buttonBox.setTranslateX(290);
		buttonBox.setTranslateY(430);
		hbox.setSpacing(spacing);
		hbox2.setSpacing(spacing);
		hbox3.setSpacing(spacing);
		hbox4.setSpacing(spacing);
		this.setTop(vbox2);
		this.setCenter(vbox);
		this.setRight(hbox3);
		this.setBottom(hbox4);
		this.setLeft(buttonBox);
	}

	public void setFrage(Frage frage) 
	{

		a = frage.getAntwortenArray()[0];
		b = frage.getAntwortenArray()[1];
		c = frage.getAntwortenArray()[2];
		d = frage.getAntwortenArray()[3];
		antwort = frage.getRichtigeAntwort();
		fragestellung = frage.getFrage();
		fragenNummer = frage.getId();

							
		
		this.setTop(null);
		this.setBottom(null);
		this.setLeft(null);
		this.setRight(null);
		this.setCenter(null);
		
		vbox.getChildren().clear();
		vbox2.getChildren().clear();
		hbox.getChildren().clear();
		hbox2.getChildren().clear();
		hbox3.getChildren().clear();
		hbox4.getChildren().clear();
		buttonBox.getChildren().clear();
		
		setFrage(fragestellung);
		setAntwort(antwort);
		setA(a);
		setB(b);
		setC(c);
		setD(d);
		setFragenNummer(fragenNummer);
		
		createLayout();
	}
	
	public void disableAllButtons() 
	{
		RadioA.setDisable(true);
		RadioB.setDisable(true);
		RadioC.setDisable(true);
		RadioD.setDisable(true);

	}

	public void enableAllButtons() 
	{
		RadioA.setDisable(false);
		RadioB.setDisable(false);
		RadioC.setDisable(false);
		RadioD.setDisable(false);

	}
	
	public void setColorRed() 
	{
		RadioA.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
		RadioB.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
		RadioC.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
		RadioD.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));

	}
	public void setNoColor() 
	{
		
		RadioA.setBackground(null);
		RadioB.setBackground(null);
		RadioC.setBackground(null);
		RadioD.setBackground(null);

	}
	
	
	public void setFrage(String frage)
	{
		this.fragestellung = frage;
	}

	public void setAntwort(String antwort)
	{
		this.antwort = antwort;
	}

	public void setA(String a)
	{
		this.a = a;
	}

	public void setB(String b)
	{
		this.b = b;
	}

	public void setC(String c)
	{
		this.c = c;
	}

	public void setD(String d)
	{
		this.d = d;
	}

	public void setFragenNummer(int fragenNummer)
	{
		this.fragenNummer = fragenNummer;
	}
	
	
	
}