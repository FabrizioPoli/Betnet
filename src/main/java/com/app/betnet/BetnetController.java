package com.app.betnet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.io.IOException;

public class BetnetController {

    @FXML
    private Button btnCloseSupport;
    @FXML
    private Button btnCloseBetModal;

    WindowHandler windowHandler = new WindowHandler();

    /*
     *******************************
     * Bet & About us View
     *******************************
     */

    public void openAboutUsView(ActionEvent actionEvent) throws IOException {
        FXMLLoader aboutUsView = new FXMLLoader(BetnetApplication.class.getResource("about-us-view.fxml"));
        windowHandler.replaceWindow(aboutUsView, actionEvent);
    }

    public void openBetView(ActionEvent actionEvent) throws IOException {
        FXMLLoader betView = new FXMLLoader(BetnetApplication.class.getResource("bet-view.fxml"));
        windowHandler.replaceWindow(betView, actionEvent);
    }

    public void openSupportView() throws IOException {
        FXMLLoader supportView = new FXMLLoader(BetnetApplication.class.getResource("support-view.fxml"));
        windowHandler.openWindow(supportView, "Support");
    }

    public void openBetModalView() throws IOException {
        FXMLLoader betModalView = new FXMLLoader(BetnetApplication.class.getResource("bet-modal-view.fxml"));
        windowHandler.openWindow(betModalView, "Wetten");
    }

    /*
     *******************************
     * Support View
     *******************************
     */

    public void closeSupportView() {
        windowHandler.closeWindow(btnCloseSupport);
    }

    /*
     *******************************
     * Bet-Modal View
     *******************************
     */

    public void closeBetModalView() {
        windowHandler.closeWindow(btnCloseBetModal);
    }


}