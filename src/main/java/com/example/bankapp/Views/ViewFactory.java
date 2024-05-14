package com.example.bankapp.Views;

import com.example.bankapp.Controllers.Client.ClientController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ViewFactory {

    //client View
    private AnchorPane dashboardView;
    public ViewFactory() {};

    public AnchorPane getDashboardView() {
        if (dashboardView == null) {
            dashboardView = new AnchorPane();
            try{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml"));
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return dashboardView;
    }

    public void showLoginWindow()
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
        createStage(loader);
    }

    public void showClientWindow()
    {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
        ClientController clientController=new ClientController();
        loader.setController(clientController);

        createStage(loader);
    }

    private void createStage(FXMLLoader loader) {
        Scene scene=null;
        try {
            scene = new Scene(loader.load());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("Bank App");
        stage.show();
    }
}
