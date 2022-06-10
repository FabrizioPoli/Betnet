package com.app.betnet;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ViewHandler {

    /**
     * Close View
     *
     * @param btn The button from the view you want to close.
     */
    public void closeSupportView(Button btn) {
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
}
