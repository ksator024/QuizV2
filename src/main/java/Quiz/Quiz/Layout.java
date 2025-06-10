package Quiz.Quiz;


import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class Layout extends Pane 
{
	App app;

		
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
	
	public void createLayout() {
	    Font fon = new Font(fontSize);
	    Image im = new Image(getClass().getResource("/images/Background.png").toExternalForm(), 
				800, //breite
				800, //hoehe
				true, //x-y Verhaeltnis beibehalten
				true); 
	    
	    BackgroundImage bi = new BackgroundImage(im, BackgroundRepeat.REPEAT, BackgroundRepeat.REPEAT,
				BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
		this.setBackground(new Background(bi));
	    
	    
	    Label labelFrage = new Label(this.fragestellung);
	    labelFrage.setFont(fon);
	    labelFrage.setMaxWidth(300);
	    labelFrage.setWrapText(true);
	    labelFrage.setLayoutX(260);
	    labelFrage.setLayoutY(20);

	    Button weiterKnopf = new Button("WEITER");
	    weiterKnopf.setFont(fon);
	    weiterKnopf.setMinWidth(180);
	    weiterKnopf.setMinHeight(90);
	    weiterKnopf.setId("weiterbutton");
	    weiterKnopf.setOnAction(app);
	    weiterKnopf.setLayoutX(300);
	    weiterKnopf.setLayoutY(700);

	    int score = 10;
	    Button scoreB = new Button("Score:" + score);
	    scoreB.setMinWidth(180);
	    scoreB.setMinHeight(90);
	    scoreB.setDisable(true);
	    scoreB.setLayoutX(620);
	    scoreB.setLayoutY(0);

	    // Radiobuttons Eigenschafften 
	    RadioA.setOnAction(app);
	    RadioA.setText(a);
	    RadioA.setFont(fon);
	    RadioA.setWrapText(true);
	    RadioA.setPrefWidth(230);
	    RadioA.setPrefHeight(150);

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

	    tg.getToggles().clear();
	    tg.getToggles().addAll(RadioA, RadioB, RadioC, RadioD);

	    //ABOSLUTE POSTIOTN 
	    RadioA.setLayoutX(150);
	    RadioA.setLayoutY(180);

	    RadioB.setLayoutX(450);
	    RadioB.setLayoutY(180);

	    RadioC.setLayoutX(150);
	    RadioC.setLayoutY(450);

	    RadioD.setLayoutX(450);
	    RadioD.setLayoutY(450);

	    this.getChildren().clear();
	    this.getChildren().addAll(labelFrage, RadioA, RadioB, RadioC, RadioD, scoreB, weiterKnopf);
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
		RadioA.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(35), Insets.EMPTY)));
		RadioB.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(35), Insets.EMPTY)));
		RadioC.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(35), Insets.EMPTY)));
		RadioD.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(35), Insets.EMPTY)));

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