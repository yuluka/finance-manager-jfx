package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import model.Balance;
import model.StaticObjects;

public class BalanceList implements Initializable {
    @FXML
    private ImageView BTTN_BACK;

    @FXML
    private Pane MAIN_PANE;

    @FXML
    private TableColumn<Balance, Double> TVCOLUMN_BALANCE;

    @FXML
    private TableColumn<Balance, String> TVCOLUMN_DATE;

    @FXML
    private TableColumn<Balance, Double> TVCOLUMN_EXPENSE;

    @FXML
    private TableColumn<Balance, Double> TVCOLUMN_INCOME;

    @FXML
    private TableView<Balance> TV_EXPENSES;

    @FXML
    void back(MouseEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/main-functions-window.fxml"));
    	loader.setController(new MainFunctionsWindow());
    	Parent root = loader.load();
    	
    	MAIN_PANE.getChildren().setAll(root);
    	MAIN_PANE.getScene().getWindow().sizeToScene();
    }

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		ObservableList<Balance> balances = FXCollections.observableList(StaticObjects.financeManager.getBalances());
		
		TVCOLUMN_DATE.setCellValueFactory(new PropertyValueFactory<Balance,String>("dateStr"));
		TVCOLUMN_INCOME.setCellValueFactory(new PropertyValueFactory<Balance,Double>("income"));
		TVCOLUMN_EXPENSE.setCellValueFactory(new PropertyValueFactory<Balance,Double>("expense"));
		TVCOLUMN_BALANCE.setCellValueFactory(new PropertyValueFactory<Balance,Double>("balance"));
		
		TV_EXPENSES.setItems(balances);
	}
}
