package sample.Controllers;
import SQLmethods.DatabaseHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class RegistrationYur {

    @FXML
    private TextField addressF;

    @FXML
    private Button backYur;

    @FXML
    private TextField bikF;

    @FXML
    private TextField nameF;

    @FXML
    private PasswordField password1;

    @FXML
    private PasswordField password2;

    @FXML
    private Button signUpYurButton;

    @FXML
    private TextField typeF;

    @FXML
    private TextField unpF;


    @FXML
    void initialize() {
        DatabaseHandler dbHandler = new DatabaseHandler();

        backYur.setOnAction(event-> {
            backYur.getScene().getWindow().hide();
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

        signUpYurButton.setOnAction(event->{
            if (password1.getText().equals(password2.getText())){
                try {
                    dbHandler.signUpCompany(typeF.getText(), nameF.getText(), unpF.getText(),
                            bikF.getText(), addressF.getText(), password1.getText());
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
