package com.app.betnet;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowHandler {

    /**
     * Opens a new window.
     *
     * @param view        The view you want to open.
     * @param windowTitle The title of the window you open.
     */
    public void openWindow(FXMLLoader view, String windowTitle) throws IOException {
        Scene scene = new Scene(view.load());
        Stage window = new Stage();
        window.setTitle(windowTitle);
        window.setScene(scene);
        window.show();
    }

    /**
     * Replaces a new window with current.
     *
     * @param view        The view you want to replace with the current.
     * @param actionEvent The event from the button.
     */
    public void replaceWindow(FXMLLoader view, ActionEvent actionEvent) throws IOException {
        Scene scene = new Scene(view.load());
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    /**
     * Close Window
     *
     * @param btn The button from the window you want to close.
     */
    public void closeWindow(Button btn) {
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
}
