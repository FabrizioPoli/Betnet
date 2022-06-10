package com.app.betnet;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ViewHandler {

    public void closeSupportView(Button btn) {
        Stage stage = (Stage) btn.getScene().getWindow();
        stage.close();
    }
}
