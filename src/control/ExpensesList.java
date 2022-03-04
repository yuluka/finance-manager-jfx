package control;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class ExpensesList {
	@FXML
    private Pane MAIN_PANE;
	
    @FXML
    private ImageView BTTN_BACK;

    @FXML
    private TableColumn<?, ?> TVCOLUMN_AMOUNT;

    @FXML
    private TableColumn<?, ?> TVCOLUMN_DATE;

    @FXML
    private TableColumn<?, ?> TVCOLUMN_DESCRIPTION;

    @FXML
    private TableView<?> TV_EXPENSES;

    @FXML
    void back(MouseEvent event) throws IOException {
    	FXMLLoader loader = new FXMLLoader(getClass().getResource("../ui/main-functions-window.fxml"));
    	loader.setController(new MainFunctionsWindow());
    	Parent root = loader.load();
    	
    	MAIN_PANE.getChildren().setAll(root);
    	MAIN_PANE.getScene().getWindow().sizeToScene();
    }
}
