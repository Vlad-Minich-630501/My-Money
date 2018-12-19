package sample;

import java.io.File;
import java.io.FileWriter;
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
import javafx.scene.paint.Stop;
import javafx.stage.Stage;

import javax.swing.*;

public class registrazia {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField singuplog;

    @FXML
    private Button ButReg;

    @FXML
    private PasswordField singuppassw;

    @FXML
    void zaregi(ActionEvent event) {

    }

    @FXML
    void initialize() {
        ButReg.setOnAction(event -> {
            String log;
            String pass;
            log = singuplog.getText()+".txt";
            File newFile = new File("D://IntelijProg//endV2//src//users", log);

            pass = singuplog.getText()+"2"+".txt";
            File newFilePa = new File("D://IntelijProg//endV2//src//users", pass);
            try
            {
                boolean created = newFile.createNewFile();
                if(created)
                    System.out.println("File has been created");
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }
            try(FileWriter writer = new FileWriter("D://IntelijProg//endV2//src//users//"+pass, false))
            {
                writer.write(singuppassw.getText());
            }
            catch(IOException ex){

                System.out.println(ex.getMessage());
            }

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/sample.fxml"));
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

    }
}
