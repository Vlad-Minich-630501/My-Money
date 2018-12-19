package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class glavn {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button dob;

    @FXML
    void showDobavit(ActionEvent event) {

    }

    Controller polzov = new Controller();


    @FXML
    void initialize() {
        assert dob != null : "fx:id=\"dob\" was not injected: check your FXML file 'glavn.fxml'.";

    }
}
