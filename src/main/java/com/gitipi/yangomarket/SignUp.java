package com.gitipi.yangomarket;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SignUp {

    @FXML
    private Button SignInButn;

    @FXML
    private TextField addressInp;

    @FXML
    private TextField ageInp;

    @FXML
    private TextField fNameInp;

    @FXML
    private PasswordField passInp;

    @FXML
    private TextField phoneInp;

    @FXML
    private Button regButn;

    public AnchorPane anchorPane;

    @FXML
    public void signIn(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        Scene scene = new Scene(parent);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}


