package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
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
    void registerIncomeOrExpense(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/registerExpenseOrIncome-window.fxml"));
    	loader.setController(new RegisterExpenseOrIncome());
    	Parent root = loader.load();
    	
    	MAIN_PANE.getChildren().setAll(root);
    	MAIN_PANE.getScene().getWindow().sizeToScene();
    }

    @FXML
    void seeBalance(ActionEvent event) {

    }

    @FXML
    void seeExpenses(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/expensesList-window.fxml"));
    	loader.setController(new ExpensesList());
    	Parent root = loader.load();
    	
    	MAIN_PANE.getChildren().setAll(root);
    	MAIN_PANE.getScene().getWindow().sizeToScene();
    }

    @FXML
    void seeIncomes(ActionEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/incomesList-window.fxml"));
    	loader.setController(new IncomesList());
    	Parent root = loader.load();
    	
    	MAIN_PANE.getChildren().setAll(root);
    	MAIN_PANE.getScene().getWindow().sizeToScene();
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
