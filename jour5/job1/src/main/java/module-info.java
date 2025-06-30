module com.example.job1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.example.job1 to javafx.fxml;
    exports com.example.job1;
}