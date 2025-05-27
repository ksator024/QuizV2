

//testitng
package Quiz.Quiz;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application  implements EventHandler<ActionEvent>{

	BorderPane root = new BorderPane();
	dbManager db;
	Frage aktuelleFrage;
	FragenManager fm;
    @Override
    public void start(Stage stage) throws Exception  {
    	db = new dbManager();
    	System.out.println(db.maxId()+"");
    	aktuelleFrage = db.getFrage(2);
    	Layout l = new Layout(this);
    	
    	l.setFrage(aktuelleFrage);
    	
    	
        Scene scene = new Scene(l, 800, 600);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
    
    @Override
    public void handle(ActionEvent event) {
		Button n = (Button)event.getSource(); // Das ist der gedrueckte Button
		if(!(n.getId().equals("Antwort"))) {
		if(aktuelleFrage.getRichtigeAntwort().equals(n.getText())) {
			//richtige Antwort
			
		}
		else {			
			
			//Falsche Antwort
		}
		}
		else {
				
			//weiterschalten
			
		}
    	
    }
    
}