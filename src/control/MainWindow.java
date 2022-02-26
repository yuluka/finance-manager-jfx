package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

public class MainWindow implements Initializable{
	@FXML
    private Pane MAIN_PANE;

    @FXML
    void filterBalance(ActionEvent event) {

    }

    @FXML
    void filterExpenses(ActionEvent event) {

    }

    @FXML
    void filterIncomes(ActionEvent event) {

    }

    @FXML
    void registerExpenses(ActionEvent event) {

    }

    @FXML
    void registerIncomes(ActionEvent event) {

    }

    @FXML
    void seeBalance(ActionEvent event) {

    }

    @FXML
    void seeExpenses(ActionEvent event) {

    }

    @FXML
    void seeIncomes(ActionEvent event) {

    }

	@Override
	public void initialize(URL location, ResourceBundle resources){
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/main-functions-window.fxml"));
			loader.setController(new MainFunctionsWindow());
			Parent root = loader.load();
			MAIN_PANE.getChildren().setAll(root);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
