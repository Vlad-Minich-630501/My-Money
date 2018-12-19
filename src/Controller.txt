package sample;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button qwe;

    @FXML
    private Button ttt;

    @FXML
    private TextField login_field;

    @FXML
    private PasswordField password_field;

    @FXML
    void actionttt(ActionEvent event) {

    }

    @FXML
    void gogo(ActionEvent event) {

    }

    @FXML
    void initialize() {
        ttt.setOnAction(event -> {
            ttt.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/registrazia.fxml"));
            try{
                loader.load();
            }catch (IOException e){
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();

        });

        qwe.setOnAction(event -> {
            String prov = login_field.getText()+".txt";

            File file = new File("D://IntelijProg//endV2//src//users//"+prov);
            boolean exists = file.exists();
            if (file.exists()==true){
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("/sample/glavn.fxml"));
                try{
                    loader.load();
                }catch (IOException e){
                    e.printStackTrace();
                }
                Parent root = loader.getRoot();
                Stage stage = new Stage();
                stage.setScene(new Scene(root));
                stage.showAndWait();
            }
            else{
                String message3 = "!!!";
                JOptionPane.showMessageDialog(null,message3,"Output",JOptionPane.PLAIN_MESSAGE);
            }
            String polz = login_field.getText();

        });
    }
}
