package com.example.communicationcontrollers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Prototipo Protoboard!");
        stage.setScene(scene);
        stage.show();
    }
    public void hola(){
        System.out.println("Hola");
        //otra prueba mas
        //bla bla bla
        //pues no se como hacerlo
    }
    public static void main(String[] args) {
        System.out.println("Hello World!");
        launch();
    }
}