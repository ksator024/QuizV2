package Quiz.Quiz;


import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.Background;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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
		
		Font fon = new Font(fontSize);
		
		// erstellung der Labels die dem User als Antwortmöglichkeiten/Frage angezeigt wird
		
		Label labelFrage = new Label(this.fragestellung);
		labelFrage.setFont(fon);
		
		Button weiterKnopf = new Button();
		weiterKnopf.setText("WEITER");
		weiterKnopf.setFont(fon);
		weiterKnopf.setMinWidth(180);
		weiterKnopf.setMinHeight(90);
		weiterKnopf.setId("weiterbutton");
		weiterKnopf.setOnAction(app);
		buttonBox.getChildren().add(weiterKnopf);
		
		RadioButton RadioA = new RadioButton();
		
		RadioA.setOnAction(app);
		RadioA.setText(a);
		RadioA.setFont(fon);
		RadioA.setWrapText(true);
		RadioA.setPrefWidth(250);
		RadioA.setPrefHeight(150);
		RadioButton RadioB = new RadioButton();
	
		RadioB.setOnAction(app);
		RadioB.setText(b);
		RadioB.setFont(fon);
		RadioB.setWrapText(true);
		RadioB.setPrefWidth(250);
		RadioB.setPrefHeight(150);

		RadioButton RadioC = new RadioButton();
		
		RadioC.setOnAction(app);
		RadioC.setText(c);
		RadioC.setFont(fon);
		RadioC.setWrapText(true);
		RadioC.setPrefWidth(250);
		RadioC.setPrefHeight(150);
		
		RadioButton RadioD = new RadioButton();
		
		RadioD.setOnAction(app);
		RadioD.setText(d);
		RadioD.setFont(fon);
		RadioD.setWrapText(true);
		RadioD.setPrefWidth(250);
		RadioD.setPrefHeight(150);

		tg.getToggles().addAll(RadioA,RadioB,RadioC,RadioD);
		
//
//		RadioB.setText("jasökdllllllllllllllfidohgooerwihgpewr");
//		RadioC.setText("jasökdllllllllllllllfidohgooerwihgpewr");
//		RadioA.setText("jasökdflllllllllllllfidohgooerwihgpewr");
//		RadioD.setText("jasökdflllllllllllllfidohgooerwihgpewr");

		// Aussehen
		// 		  Frage
		//		A		B
		//		C		D
		
		vbox2.getChildren().add(labelFrage);
		labelFrage.setMaxWidth(300);
		labelFrage.setWrapText(true);
		vbox2.setTranslateX(240);	// die Zahlen können geändert werden. Sie dienen nur der Optik
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