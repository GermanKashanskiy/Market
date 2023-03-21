package com.gitipi.yangomarket;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class Login {

    @FXML
    public Button signUpButn;

    @FXML
    private Button loginButn;

    @FXML
    private PasswordField passInp;

    @FXML
    private TextField phoneInp;

    public AnchorPane anchorPane;

    @FXML
    public void signUpLoader(ActionEvent actionEvent) throws IOException {
        signUpButn.setOnAction(event -> {

            Parent parent = null;
            try {
                parent = FXMLLoader.load(this.getClass().getResource("signUp.fxml"));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Scene scene = new Scene(parent);
            Stage stage = (Stage) anchorPane.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Market");
            stage.setResizable(false);
            stage.show();
        });

    }

}
