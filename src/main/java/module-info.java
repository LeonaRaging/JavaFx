module com.beginsecure.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.beginsecure.javafx to javafx.fxml;
    exports com.beginsecure.javafx;
}