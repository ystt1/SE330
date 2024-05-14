package com.example.bankapp;

import com.example.bankapp.Views.ViewFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        ViewFactory viewFactory=new ViewFactory();
        viewFactory.showLoginWindow();
    }
}
