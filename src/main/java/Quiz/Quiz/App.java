
//testitng
package Quiz.Quiz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application implements EventHandler<ActionEvent>
{

	BorderPane root = new BorderPane();
	dbManager db;
	Frage aktuelleFrage;
	FragenManager fm;
	Layout l;

	@Override
	public void start(Stage stage) throws Exception
	{
		db = new dbManager();
		fm = new FragenManager(db);
		System.out.println(db.maxId() + "");
		aktuelleFrage = db.getFrage(2);
		l = new Layout(this);

		l.setFrage(aktuelleFrage);

		Scene scene = new Scene(l, 800, 800);
		stage.setScene(scene);
		stage.show();
	}

	public static void main(String[] args)
	{
		launch();
	}

	@Override
	public void handle(ActionEvent event)
	{
		Object temp = event.getSource(); // Das ist der gedrueckte Button
		if (temp instanceof RadioButton)
		{
			RadioButton n = (RadioButton) temp;
			if (aktuelleFrage.getRichtigeAntwort().equals(n.getText()))
			{
				// richtige Antwort
				System.out.println("richtig");
				l.disableAllButtons();
				l.setColorRed();
				n.setBackground(new Background(new BackgroundFill(Color.GREEN, new CornerRadii(50), Insets.EMPTY)));
			} else
			{
				System.out.println("falsch");
				// Falsche Antwort
				l.disableAllButtons();
				l.setColorRed();
				
			}
		} else
		{
			
			l.enableAllButtons();
			l.setNoColor();
			Button n = (Button) temp;
			System.out.println("TEST");
			try
			{
				aktuelleFrage = fm.neueFrage();
				l.setFrage(aktuelleFrage);
			} catch (Exception e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			// weiterschalten
		}
	}
}