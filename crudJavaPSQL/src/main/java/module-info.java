module com.farmcont.aulamaven {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.sql;


    opens com.farmcont.aulamaven to javafx.fxml;
    exports com.farmcont.aulamaven;
}