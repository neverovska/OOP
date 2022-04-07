package sample.Controllers;


import javafx.scene.control.TextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import SQLmethods.DatabaseHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class RegistrationFiz {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private CheckBox RBCheckout;

    @FXML
    private TextField emailF;

    @FXML
    private Button fizBack;

    @FXML
    private TextField lastname;

    @FXML
    private TextField nameF;

    @FXML
    private TextField passportIDF;

    @FXML
    private TextField passportNumF;

    @FXML
    private PasswordField password1;

    @FXML
    private PasswordField password2;

    @FXML
    private TextField patronymicF;

    @FXML
    private TextField phoneNumberF;

    @FXML
    private Button signUpButton;


    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        fizBack.setOnAction(event-> {
            fizBack.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/sample/View/authorization.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();
        });

        signUpButton.setOnAction(event->{
            if (password1.getText().equals(password2.getText())){
                try {
                    dbHandler.signUpUser(nameF.getText(), lastname.getText(), patronymicF.getText(),
                            phoneNumberF.getText(), emailF.getText(), password1.getText(),
                            passportIDF.getText(), passportNumF.getText(), true);
                } catch (SQLException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
            else {
                password2.setPromptText("Неверно");
                password2.setStyle("-fx-border-color: red;");
            }
        });
    }

}