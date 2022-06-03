package com.app.betnet;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BetnetController {

    @FXML private Button btnCloseSupport;

    public void openSupportView() throws IOException {
        FXMLLoader supportView = new FXMLLoader(BetnetApplication.class.getResource("support-view.fxml"));
        Scene supportScene = new Scene(supportView.load());
        Stage supportWindow = new Stage();
        supportWindow.setTitle("Support");
        supportWindow.setScene(supportScene);
        supportWindow.show();
    }

    public void closeSupportView() throws  IOException {
        Stage stage = (Stage) btnCloseSupport.getScene().getWindow();
        stage.close();
    }


}