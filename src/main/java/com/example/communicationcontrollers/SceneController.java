package com.example.communicationcontrollers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class SceneController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    public void goToProtoboard(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("protoboard.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }

    public void goToMainTab(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(parent);

        stage.setScene(scene);
        stage.show();
    }
}