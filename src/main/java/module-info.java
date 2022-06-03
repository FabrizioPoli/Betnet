module com.app.betnet {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.app.betnet to javafx.fxml;
    exports com.app.betnet;
}