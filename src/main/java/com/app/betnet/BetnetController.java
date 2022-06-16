package com.app.betnet;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.util.Optional;

public class BetnetController {

    @FXML
    private Button btnCloseSupport;
    @FXML
    private Button btnCloseBetModal;
    @FXML
    private Button btnSendBet;
    @FXML
    private TextField tbxBet;
    @FXML
    private TextField tbxTotalBet;

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
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Die Daten gehen verloren!");
        alert.setContentText("Möchten sie das Fenster wirklich verlassen? Ihre Daten werden nicht gespeichert.");
        alert.showAndWait();
        if (alert.getResult() == ButtonType.OK) {
            windowHandler.closeWindow(btnCloseSupport);
        } else {
            alert.close();
        }

    }

    public void submitEmail() {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Email versenden wird nicht unterstützt!");
        alert.setContentText("Das Versenden von Emails funktioniert nicht, da Google, Drittanbieter nicht mehr unterstützt.\nMehr: https://support.google.com/accounts/answer/6010255");
        alert.show();
    }

    /*
     *******************************
     * Bet-Modal View
     *******************************
     */

    public void closeBetModalView() {
        windowHandler.closeWindow(btnCloseBetModal);
    }

    public void submitBet(ActionEvent event) {
        try {
            double bet = Double.parseDouble(tbxBet.getText());
            closeBetModalView();
        } catch (NumberFormatException e) {
            System.out.println("Enter only numbers please.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}