package com.app.betnet;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BetnetController {

    @FXML
    private Button btnCloseSupport;
    @FXML
    private Button btnCloseBetModal;

    ViewHandler viewHandler = new ViewHandler();

    /*
    *******************************
    * Bet View
    *******************************
    */

    public void openSupportView() throws IOException {
        FXMLLoader supportView = new FXMLLoader(BetnetApplication.class.getResource("support-view.fxml"));
        Scene supportScene = new Scene(supportView.load());
        Stage supportWindow = new Stage();
        supportWindow.setTitle("Support");
        supportWindow.setScene(supportScene);
        supportWindow.show();
    }

    public void openBetModalView() throws IOException {
        FXMLLoader supportView = new FXMLLoader(BetnetApplication.class.getResource("bet-modal-view.fxml"));
        Scene supportScene = new Scene(supportView.load());
        Stage supportWindow = new Stage();
        supportWindow.setTitle("Wetten");
        supportWindow.setScene(supportScene);
        supportWindow.show();
    }

    /*
    *******************************
    * Support View
    *******************************
    */

    public void closeSupportView() {
        viewHandler.closeSupportView(btnCloseSupport);
    }

    /*
    *******************************
    * Bet-Modal View
    *******************************
    */

    public void closeBetModalView() {
        viewHandler.closeSupportView(btnCloseBetModal);
    }


}